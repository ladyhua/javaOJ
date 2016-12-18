package com.thinking.in.java.code;


import java.util.concurrent.TimeUnit;

public class P662Middle implements Runnable{
	private static int count;
	private final int id = count++;
	@Override
	public String toString() {
		return "P662Middle : " + id;
	}
	@Override
	public void run() {
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println((Thread.currentThread() + " " + this));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		for(int i=0; i<10; i++) {
			Thread t = new Thread(new P662Middle());
			t.setDaemon(true);
			t.start();
		}
		System.out.println("All daemon started");
		try {
			TimeUnit.MILLISECONDS.sleep(99);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
