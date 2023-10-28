package com.sanjith.cricket_application;

import org.json.simple.JSONArray;


@SuppressWarnings("serial")
class CustomException extends Exception {
	  public CustomException(String message) {
	    super(message);
	  }
	}

public class OverRepository {
	
	static int totalRuns=0;
	static int totalWickets=0;
	
	public void createOver(Over o) throws CustomException, Exception {
		if(totalWickets>=4) 
			throw new CustomException("All out.");
		if(o.getOverNumber()>6) 
			throw new CustomException("The innings is over.");
		else {
			DatabaseConnector.insertValue(o);
			DatabaseConnector.updateTable(o);
		}
	}
	public JSONArray getOvers() throws Exception {
		return DatabaseConnector.selectTable("oversTable");
	}
	public JSONArray battingScorecard() throws Exception{
		return DatabaseConnector.selectTable("batsmanTable");
	}
	public JSONArray bowlingScorecard() throws Exception{	
		return DatabaseConnector.selectTable("bowlersTable");
	}	
}
