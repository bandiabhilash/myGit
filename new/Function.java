package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList cart = new ArrayList();
		String ItemName;
		String ItemNumbers;
		String ItemPrice;
		String ItemWeight;
		String choice;
		int ch;
		Cart ShoppingCart = new Cart();
		while (true) {
			System.out.println("----LIST----");
			System.out.println("0 for exit");
			System.out.println("1 for add items");
			System.out.println("2 for remove items");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter u r response");
			case 2:
				System.out.println("enter ItemName");
				ItemName = sc.next();
				System.out.println("enter ItemNumbers");
				ItemNumbers = sc.next();
				System.out.println("enter ItemPrice");
				ItemPrice = sc.next();
				System.out.println("enter ItemWeight");
				ItemWeight = sc.next();
				ShoppingCart.add(ItemName, ItemNumbers, ItemPrice, ItemWeight);
				break;
			case 3:
				System.out.println("Enter item name to remove");
				choice = sc.next();
				ShoppingCart.remove();

			}

		}
	}
}
