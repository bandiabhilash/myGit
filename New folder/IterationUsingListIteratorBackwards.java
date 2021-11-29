package com.Linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterationUsingListIteratorBackwards {

	private static LinkedList myHeros = new LinkedList();

	public static void main(String[] args) {
		SuperHeros S1 = new SuperHeros("Balayya", "Tesla");
		SuperHeros S2 = new SuperHeros("uday", "Benz");
		SuperHeros S3 = new SuperHeros("Ram", "Audi");
		SuperHeros S4 = new SuperHeros("ntr", "Bmw");

		myHeros.add(S1);
		myHeros.add(S2);
		myHeros.add(S3);
		myHeros.add(S4);

		getSuperHeros();
	}

	public static void getSuperHeros() {
		ListIterator itr = myHeros.listIterator(myHeros.size());
		while (itr.hasPrevious()) {
			SuperHeros hero = (SuperHeros) itr.previous();
			System.out.println(hero.getName() + " uses " + hero.getWeapon());
		}
	}
}