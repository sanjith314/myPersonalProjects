package com.sanjith.cricket_application;

public class Batsman {
	private String batmanName;
	private String battingStatus;
	private String wicketType;
	private int runsScored;
	
	Batsman(String batsmanName, String battingStatus, String wicketType, int runsScored){
		this.batmanName=batsmanName;
		this.battingStatus=battingStatus;
		this.wicketType=wicketType;
		this.runsScored=runsScored;	
	}
	Batsman(){}
	
	public String getBatmanName() {
		return batmanName;
	}
	public void setBatmanName(String batmanName) {
		this.batmanName = batmanName;
	}
	public String getBattingStatus() {
		return battingStatus;
	}
	public void setBattingStatus(String battingStatus) {
		this.battingStatus = battingStatus;
	}
	public String getWicketType() {
		return wicketType;
	}
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
		
}