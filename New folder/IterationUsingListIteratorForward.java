package com.Linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterationUsingListIteratorForward {

	public static LinkedList myHeros = new LinkedList();

	public static void main(String[] args) {
		SuperHeros S1 = new SuperHeros("Balayya", "Tesla");
		SuperHeros S2 = new SuperHeros("Ram", "Audi");
		SuperHeros S3 = new SuperHeros("uday", "Benz");
		SuperHeros S4 = new SuperHeros("ntr", "Bmw");

		myHeros.add(S1);
		myHeros.add(S2);
		myHeros.add(S3);
		myHeros.add(S4);

		getSuperHeros();

	}

	public static void getSuperHeros() {
		ListIterator li = myHeros.listIterator();
		while (li.hasNext()) {
			SuperHeros hero = (SuperHeros) li.next();
			System.out.println(hero.getName() + " " + hero.getWeapon());
		}

	}

}