package com.Age;

import java.util.Scanner;

public class AgeCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter u r age");

		int age = sc.nextInt();

		int b = 2021 - age;
		if (b >= 1997 && b <= 2012) {
			System.out.println("yor are a genz");
		} else if (b >= 1981 && b <= 1996) {
			System.out.println("you are a millinial");
		}

//		if (age <= 24) {
//
//			System.out.println("your age is: " + age + ": your are  gen Z ");
//
//		} else if (age >= 25) {
//
//			System.out.println("your age is: " + age + ": your are millinial");
//		} else
//			System.out.println("you are not a genz and millinial");
//
//	}
	}
}
