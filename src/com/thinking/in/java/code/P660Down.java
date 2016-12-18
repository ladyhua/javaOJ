package com.thinking.in.java.code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P660Down implements Runnable{
	private int countDown = 5;
	private volatile double d;
	private int priority;
	public P660Down(int priority) {
		this.priority = priority;
	}
	public String toString() {
		return Thread.currentThread() + ":" + countDown;
	}
	public void run() {
		Thread.currentThread().setPriority(priority);
		while(true) {
			for(int i=1; i<100000; i++) {
				d += (Math.PI + Math.E) / (double)i;
				if(i % 1000 == 0) {
					Thread.yield();
				}
			}
			System.out.println(this);
			if(--countDown == 0) return;
		}
	}
	
	public static void main(String args[]) {
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i=0; i<5; i++) {
			es.execute(new P660Down(Thread.MIN_PRIORITY));
		}
		es.execute(new P660Down(Thread.MAX_PRIORITY));
		es.shutdown();
	}
}
