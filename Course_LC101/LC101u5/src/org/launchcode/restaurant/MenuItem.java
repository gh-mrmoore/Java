package org.launchcode.restaurant;

import java.util.Date;

public class MenuItem {
	double itemPrice;
	String itemName;
	String itemDescription;
	String itemCategory;
	Date itemDateAdded;
	
	//constructor(s) for MenuItem
	
	//getter-setter pairs
	public double getItemPrice() {return itemPrice;}
	public void setItemPrice(double itemPrice) {this.itemPrice = itemPrice;}
	
	public String getItemDescription() {return itemDescription;}
	public void setItemDescription(String itemDescription) {this.itemDescription = itemDescription;}
	
	public String getItemName() {return itemName;}
	public void setItemName(String itemName) {this.itemName = itemName;}
	
	public String getItemCategory() {return itemCategory;}
	public void setItemCategory(String itemCategory) {this.itemCategory = itemCategory;}
	
	public Date getItemDateAdded() {return itemDateAdded;}
	public void setItemDateAdded(Date itemDateAdded) {this.itemDateAdded = itemDateAdded;}
	
	//special methods for MenuItem
	public String toString() {
        return "Item: " + itemName + " Description: " + itemDescription + " Added: " + itemDateAdded + " Category: " + itemCategory + " Price: " + itemPrice;
    }
}