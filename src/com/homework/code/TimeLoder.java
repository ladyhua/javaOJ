package com.homework.code;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TimeLoder implements Runnable {
	@Override
	public void run() {
			while(true) {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(new Date());
			}
	}
	public static void main(String args[]) {
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new TimeLoder());
	}
}
