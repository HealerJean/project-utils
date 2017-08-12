package com.hlj.thread;

public class Testthread implements Runnable{
	@Override
	public void run() {
		System.out.println("run.");
		throw new RuntimeException("Problem");
		
	}
	public static void main(String[] args) {
		Thread thread = new Thread(new Testthread());
		thread.start();
		System.out.println("End of method");
	}
}
