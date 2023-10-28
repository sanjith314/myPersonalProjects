package com.sanjith.cricket_application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DatabaseConnector {
	
	static String url="jdbc:mysql://localhost:3306/cricketdb";
	static String username="root";
	static String password="sanjith314";
	
	public static void insertValue(Over o) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username, password);
		
		//Insert into overs table
		String oversQuerry="Insert into overs values(?,?,?,?,?)";
		PreparedStatement overStmt= con.prepareStatement(oversQuerry);
		overStmt.setInt(1, o.getOverNumber());
		overStmt.setInt(2, o.getBowlerId());
		overStmt.setInt(3, o.getRuns());
		overStmt.setInt(4, o.getExtras());
		overStmt.setInt(5, o.getWickets());
		
		int count= overStmt.executeUpdate();
		System.out.println(count+"row/s affected");
		overStmt.close();
		
	}
	
	public static void updateTable(Over o) throws Exception{

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username, password);
		
		//update bowlers table
		String bowlersQuerry="UPDATE bowlers set runs = runs + " + o.getRuns() + " , wickets = wickets + "+ o.getWickets()+ " , overs_bowled = overs_bowled + 1 where bowler_id = "+o.getBowlerId();
		Statement bowlersStmt=con.createStatement();
		bowlersStmt.executeUpdate(bowlersQuerry);
		bowlersStmt.close();
				
		//update batsman table
		Statement batsmanStmt= con.createStatement();
		for(int i=1;i<=5;i++) {
			String query="";
			switch(i) {
				case 1: query="UPDATE batsman set runs_scored = runs_scored + " +o.getBatsman1() + " where batsman_id= " + i; break;
				case 2: query="UPDATE batsman set runs_scored = runs_scored + " +o.getBatsman2() + " where batsman_id= " + i; break;
				case 3: query="UPDATE batsman set runs_scored = runs_scored + " +o.getBatsman3() + " where batsman_id= " + i; break;
				case 4: query="UPDATE batsman set runs_scored = runs_scored + " +o.getBatsman4() + " where batsman_id= " + i; break;
				case 5: query="UPDATE batsman set runs_scored = runs_scored + " +o.getBatsman5() + " where batsman_id= " + i; break;
			}
		batsmanStmt.executeUpdate(query);
		}
		if(o.getWickets()>0) {
			OverRepository.totalWickets++;
			String nextBatsmanQuerry="UPDATE batsman set batting_status = 'not out ' where batsman_id = "+ (OverRepository.totalWickets+2);
			String querry="UPDATE batsman set batting_status= 'out' , wicket_type = '"+ o.getWicketType() + "' where batsman_id = " + o.getBatsmanOutId();
			batsmanStmt.executeUpdate(querry);
			batsmanStmt.executeUpdate(nextBatsmanQuerry);
		}
		batsmanStmt.close();
	}
	
	@SuppressWarnings("unchecked")
	public static JSONArray selectTable(String table) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		JSONArray arr= new JSONArray();

		//Select overs table
		if(table.equals("oversTable")) {
			String querry="SELECT o.over_number, o.bowler_id, b.bowler_name, o.runs, o.extras, o.wickets \n"
					+ "from overs o\n"
					+ "join bowlers b \n"
					+ "where o.bowler_id =b.bowler_id;";
			ResultSet rs =st.executeQuery(querry);
			while(rs.next()) {
				JSONObject obj= new JSONObject();
				obj.put("over_number", rs.getInt(1));
				obj.put("bowler_id", rs.getInt(2));
				obj.put("bowler_name", rs.getString(3));
				obj.put("runs", rs.getInt(4));
				obj.put("extras", rs.getInt(5));
				obj.put("wickets", rs.getInt(6));
				arr.add(obj);
			}
			st.close();
			con.close();
		}

		//Select batsman table
		else if(table.equals("batsmanTable")) {
			String querry="SELECT * from batsman";
			ResultSet rs =st.executeQuery(querry);
			while(rs.next()) {
				JSONObject obj= new JSONObject();
				obj.put("batsman_id", rs.getInt(1));
				obj.put("batsman_name", rs.getString(2));
				obj.put("batting_status", rs.getString(3));
				obj.put("wicket_type", rs.getString(4));
				obj.put("runs_scored", rs.getInt(5));
				arr.add(obj);
			}
			st.close();
			con.close();
		}

		//Select bowlers table
		else {
			String querry="SELECT * from bowlers";
			ResultSet rs =st.executeQuery(querry);
			while(rs.next()) {
				JSONObject obj= new JSONObject();
				obj.put("bowler_id", rs.getInt(1));
				obj.put("bowler_name", rs.getString(2));
				obj.put("wickets", rs.getInt(3));
				obj.put("runs", rs.getInt(4));
				obj.put("overs_bowled", rs.getInt(5));
				arr.add(obj);
			}
			st.close();
			con.close();
		}
		return arr;	
	}
}
