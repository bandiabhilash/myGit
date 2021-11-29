package com.Linkedlist;

import java.util.LinkedList;

public class IterationUsingForEach {

	private static LinkedList myHeros = new LinkedList();

	public static void main(String[] args) {

		SuperHeros S1 = new SuperHeros("Balayya", "Tesla");
		SuperHeros S2 = new SuperHeros("uday", "Benz");
		SuperHeros S3 = new SuperHeros("Ram", "Audi");
		SuperHeros S4 = new SuperHeros("ntr", "BMW");

		myHeros.add(S1);
		myHeros.add(S2);
		myHeros.add(S3);
		myHeros.add(S4);

		getSuperHeros();
	}

	public static void getSuperHeros() {
		for (Object heros : myHeros) {
			SuperHeros myHeros = (SuperHeros) heros;
			System.out.println(myHeros.getName() + " uses " + myHeros.getWeapon());
		}
	}
}