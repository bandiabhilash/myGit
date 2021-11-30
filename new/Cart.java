package com.ArrayList;

import java.util.Scanner;

public class Cart {

	private String Count;
	private double Price;
	private static int Weight;

	public static void main(String[] args) {

	}

	public void add(String itemName, String itemNumbers, String itemPrice, String itemWeight) {
		add("maggi", "5", "50", "500gms");

	}

	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unwanted item");
		String s = sc.next();
		GroceryList.al.remove(s);
		System.out.println(GroceryList.al);

	}
}
