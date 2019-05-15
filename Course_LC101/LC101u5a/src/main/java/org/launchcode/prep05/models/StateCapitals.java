package org.launchcode.prep05.models;

public class StateCapitals {
	private static int nextCapitalID = 1;
	
	private int capitalID;
	private String stateName;
	private String capitalName;
	
	//constructor(s) for StateCapitals
	public StateCapitals(int capitalID, String stateName, String capitalName) {
		this.capitalID = nextCapitalID;
		this.stateName = stateName;
		this.capitalName = capitalName;
		nextCapitalID++;
	}

	//getter-setter pairs
	public String getStateName() {return stateName;}
	public void setStateName(String stateName) {this.stateName = stateName;}
	public String getCapitalName() {return capitalName;}
	public void setCapitalName(String capitalName) {this.capitalName = capitalName;}
}