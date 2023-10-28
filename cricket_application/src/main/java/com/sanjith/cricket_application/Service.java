package com.sanjith.cricket_application;

import org.json.simple.JSONArray;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("cricket")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Service {
	
	OverRepository repoObj=new OverRepository();
	
	@POST
	@Path("add_over")
	public Over createOver(Over o) throws CustomException, Exception {
		System.out.println("createOver() was called");
		repoObj.createOver(o);
		return o;
	}
	
	@GET
	@Path("print_overs")
	public JSONArray getOvers() throws Exception{
		System.out.println("getOvers() was called");
		return repoObj.getOvers();
	}
	
	@GET
	@Path("batting_scorecard")
	public JSONArray battingScoreCard() throws Exception{
		System.out.println("battingScoreCard() was called");
		return repoObj.battingScorecard();
	}
	
	@GET
	@Path("bowling_scorecard")
	public JSONArray bowlingScoreCard() throws Exception{
		System.out.println("bowlingScoreCard() was called");
		return repoObj.bowlingScorecard();
	}
	
}