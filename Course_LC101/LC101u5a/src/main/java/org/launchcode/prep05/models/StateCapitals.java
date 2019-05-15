package org.launchcode.prep05.models;

public class StateCapitals {
	private static int nextCapitalID = 1;
	
	private int capitalID;
	private String stateName;
	private String capitalName;
	
	//constructor(s) for StateCapitals
	public StateCapitals(String capitalName, String stateName) {
		this.capitalID = nextCapitalID;
		this.stateName = stateName;
		this.capitalName = capitalName;
		nextCapitalID++;
	}
	
	//getter-setter pairs
	public int getCapitalID() {return capitalID;}
	public void setCapitalID(int capitalID) {this.capitalID = capitalID;}

	public String getStateName() {return stateName;}
	public void setStateName(String stateName) {this.stateName = stateName;}
	
	public String getCapitalName() {return capitalName;}
	public void setCapitalName(String capitalName) {this.capitalName = capitalName;}
	
	//special methods for StateCapitals
	public String toString() {
		return "City: " + capitalName + ", State: " + stateName + ", ID: " + capitalID;
	}
}