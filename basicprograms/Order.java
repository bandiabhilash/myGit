package com.basicprograms;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size:");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the value:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j])

				{

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
		System.out.println("after sorting");

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
	}

}