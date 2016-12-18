package com.thinking.in.java.code;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class P660T6Second implements Runnable {
	private static int count;
	private final int id = count++;
	
	@Override
	public void run() {
		Random rand = new Random();
		int sleepTime = rand.nextInt(10) + 1;
		try {
			TimeUnit.SECONDS.sleep(sleepTime);
			System.out.println("Thread " + id + "sleeped" + sleepTime + "seconds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static void main(String args[]) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0; i<10; i++) {
			exec.execute(new P660T6Second());
		}
		exec.shutdown();
	}
}
