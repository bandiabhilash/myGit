package com.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterationUsingIterator {

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
		Iterator itr = myHeros.iterator();
		while (itr.hasNext()) {
			SuperHeros hero = (SuperHeros) itr.next();
			System.out.println(hero.getName() + " uses " + hero.getWeapon());
		}
	}
}