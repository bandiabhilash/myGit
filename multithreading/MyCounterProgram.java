package com.multithreading;

public class MyCounterProgram {

	public static void main(String[] args) {
		CountDown cd = new CountDown();
		Counter con1 = new Counter(cd);

		Thread t1 = new Thread(con1);
		t1.setName("Thread 1");

		Thread t2 = new Thread(con1);
		t2.setName("Thread 2");

		t1.start();
		t2.start();
//		con1.setName("Thread 1");
//		Counter con2 = new Counter(cd);
//		con2.setName("Thread 2");
//
//		con1.start();
//		con2.start();

	}

}

class CountDown {

	public synchronized void doCountDown() {
		String color;
		switch (Thread.currentThread().getName()) {
		case "Thread 1":
			color = "Blue";
			break;
		case "Thread 2":
			color = "Green";
			break;
		case "Thread 3":
			color = "Red";
			break;
		default:
			color = "Black";
		}
		for (int i = 10; i > 0; i--) {
			System.out.println(color + Thread.currentThread().getName() + ", i : " + i);
		}
	}

}

class Counter implements Runnable {

	CountDown countDown;

	public Counter(CountDown countDown) {
		this.countDown = countDown;
	}

	@Override
	public void run() {
		this.countDown.doCountDown();

	}

}