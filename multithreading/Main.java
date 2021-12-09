package com.multithreading;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello I am the main thread!");

		System.out.println("The name of the thread is : " + Thread.currentThread().getName());
		Thread.currentThread().setPriority(7);
		System.out.println("The priority of the " + Thread.currentThread().getName() + " thread is :"
				+ Thread.currentThread().getPriority());

//		new Thread() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 5; i++) {
//					System.out.println("Hello from the HYD Anonymous class for the " + i + "th time");
//				}
//			}
//		}.start();

		WebServer1 wb1 = new WebServer1();

		wb1.start();

//		WebServer2 wb2 = new WebServer2();
//		Thread myRunnableThread = new Thread(wb2);
//		myRunnableThread.start();

//		Thread myRunnableThread = new Thread(new WebServer2() {
//
//			@Override
//			public void run() {
//				System.out.println("Hello Donald, why are you sleeping da?");
//				try {
//					wb1.join(7000);
//					System.out.println("Webserver 1 didn't finish his job in 3 secs hence I am waking up");
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//
//		});
//
//		myRunnableThread.start();

	}

}