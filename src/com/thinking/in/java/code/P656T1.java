package com.thinking.in.java.code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P656T1 implements Runnable{
	private int count = 3;
	private static int taskCount;
	private final int id = taskCount++;
	public P656T1() {
		System.out.println(id + " task start!");
		/*System.out.println("task end!");*/
	}
	
	@Override
	public void run() {
		while(count-- > 0) {
			System.out.println(id + "(" + count +")");
			Thread.yield();
		}
	}
	public static void main1() {
		for(int i=0; i<5; i++) {
			Thread thread = new Thread(new P656T1());
			thread.start();
		}
	} 
	public static void main2() {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0; i<5; i++) {
			exec.execute(new P656T1());
		}
		exec.shutdown();
	}
	public static void main3() {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i=0; i<5; i++) {
			exec.execute(new P656T1());
		}
		exec.shutdown();
	}
	public static void main4() {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i=0; i<5; i++) {
			exec.execute(new P656T1());
		}
		exec.shutdown();
	}
	public static void main(String[] args) {
		main1();
		//main2();
		//main3();
		//main4();
	}	
}
