package com.multithreading;

public class WebServer2 implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("WebServer2");
		for (int i = 0; i < 5; i++) {
			System.out
					.println("Hi there, hello from " + Thread.currentThread().getName() + " for the " + i + "th time");
		}

	}

}