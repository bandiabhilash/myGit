package com.ArrayList;

import java.util.ArrayList;

class GroceryList {

	static ArrayList al = new ArrayList();

	private String ItemName;
	private String ItemNumbers;
	private String ItemPrice;
	private String ItemWeight;

	public GroceryList(String itemName, String itemNumbers, String itemPrice, String itemWeight) {
		ItemName = itemName;
		ItemNumbers = itemNumbers;
		ItemPrice = itemPrice;
		ItemWeight = itemWeight;
	}

	public String getItemName() {
		return ItemName;
	}

	public String getItemNumbers() {
		return ItemNumbers;
	}

	public String getItemPrice() {
		return ItemPrice;
	}

	public String getItemWeight() {
		return ItemWeight;
	}

	public static void main(String[] args) {

	}

}
