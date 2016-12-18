package com.thinking.in.java.code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class P678T11 implements Runnable{
	private static int a;
	private static int b;
	//private boolean flag = false;
	public int test() {
		a++;
		
//		try {
//			TimeUnit.SECONDS.sleep(1);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		b++;
		return a + b;
	}
	@Override
	public void run() {
		while(true) {
			int c = test();
			if(c % 2 != 0) {
				System.out.println("error");
				break;
			} else {
				//System.out.println(Thread.currentThread() + "read a + b success.");
			}
		}
	}
	public static void main(String args[]) {
		ExecutorService exce = Executors.newCachedThreadPool();
		for(int i=0; i<10; i++) {
			exce.execute(new P678T11());
		}
	}
}
