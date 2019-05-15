package org.launchcode.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
	Date menuDate;
	ArrayList<MenuItem> items;
	
	//constructor(s) for Menu
	
	//getter-setter pairs
	public Date getMenuDate() {return menuDate;}
	public void setMenuDate(Date menuDate) {this.menuDate = menuDate;}
	
	public ArrayList<MenuItem> getItems() {return items;}
	public void setItems(ArrayList<MenuItem> items) {this.items = items;}
	

}
