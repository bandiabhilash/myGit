package com.multithreading;

public class WebServer1 extends Thread {

	public void printSomething() {
		System.out.println("You want me to print something, so be it: Something");
	}

	@Override
	public void run() {
		Thread.currentThread().setName("WebServer1");
		System.out.println("The priority of the " + Thread.currentThread().getName() + " thread is "
				+ Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(MAX_PRIORITY);

		System.out.println("The priority of the " + Thread.currentThread().getName() + " thread is "
				+ Thread.currentThread().getPriority());

//		try {
//			Thread.sleep(5000);
//			System.out.println("Slept for 5000 sec, now I feel refreshed");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}