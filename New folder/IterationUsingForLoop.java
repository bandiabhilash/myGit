package com.Linkedlist;

import java.util.LinkedList;

public class IterationUsingForLoop {

	private static LinkedList myHeros = new LinkedList();

	public static void main(String[] args) {

		SuperHeros S1 = new SuperHeros("Balayya", "Tesla");
		SuperHeros S2 = new SuperHeros("Uday", "Benz");
		SuperHeros S3 = new SuperHeros("Ram", "Audi");
		SuperHeros S4 = new SuperHeros("Ram", "BMW");

		myHeros.add(S1);
		myHeros.add(S2);
		myHeros.add(S3);
		myHeros.add(S4);
		getSuperHeros();

	}

	public static void getSuperHeros() {

		SuperHeros heros;
		for (int i = 0; i < myHeros.size(); i++) {
			heros = (SuperHeros) myHeros.get(i);
			System.out.println(heros.getName() + " ");
		}
	}

}