package com.homework.code;

import java.util.concurrent.TimeUnit;

public class Time2 implements Runnable {
	private int fullTime;
	public Time2(int fullTime) {
		this.fullTime = fullTime;
	}
	public int getFullTime() {
		return fullTime;
	}
	@Override
	public void run() {
		for(int i=fullTime; i>-1; i--) {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Time2(100));
		thread.start();
		
	}
}
