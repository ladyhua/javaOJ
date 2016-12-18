package com.thinking.in.java.code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Runnable1 implements Runnable {
	public synchronized void run() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Runnable1 wait end ohh yeyeye success!!!");
	}
}

class Runnable2 implements Runnable {
	private Runnable run1;
	public Runnable2(Runnable run1) {
		this.run1 = run1; 
	}
	public synchronized void run() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized(run1) {
			run1.notifyAll();
		}
	}
}
public class P706T21 {
	public static void main(String args[]) {
		ExecutorService exce = Executors.newCachedThreadPool();
		Runnable1 run1 = new Runnable1();
		exce.execute(run1);
		exce.execute(new Runnable2(run1));
		exce.shutdown();
	}
}
