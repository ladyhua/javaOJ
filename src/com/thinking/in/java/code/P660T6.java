package com.thinking.in.java.code;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class P660T6 implements Runnable {
	private int id;
	
	public P660T6(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		Random rand = new Random();
		int sleepTime = rand.nextInt(10) + 1;
		try {
			TimeUnit.SECONDS.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("interrupted");
			e.printStackTrace();
		}
		System.out.println(id + " sleep :" + sleepTime + "seconds");
	}
	
	public static void main(String args[]) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0; i<10000; i++) {
			exec.execute(new P660T6(i));
		}
		exec.shutdown();
	}
}
