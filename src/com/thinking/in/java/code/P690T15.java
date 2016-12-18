package com.thinking.in.java.code;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P690T15 {
	private Lock lock = new ReentrantLock();
	public void f() {
		Lock lock1 = lock;
		//Lock lock1 = new ReentrantLock();
		lock1.lock();
		try {
			for(int i=0; i<5; i++) {
				System.out.println("f() : " + i);
				Thread.yield();
			}
		} finally {
			lock1.unlock();
		}
	}
	
	public void g() {
		Lock lock2 = lock;
		//Lock lock2 = new ReentrantLock();
		lock2.lock();
		try {
			for(int i=0; i<5; i++) {
				System.out.println("g() : " + i);
				Thread.yield();
			}
		} finally {
			lock2.unlock();
		}
	}
	
	public void h() {
		Lock lock3 = lock;
		//Lock lock3 = new ReentrantLock();
		lock3.lock();
		try {
			for(int i=0; i<5; i++) {
				System.out.println("h() : " + i);
				Thread.yield();
			}
		} finally {
			lock3.unlock();
		}
	}
	
	public static void main(String args[]) {
		P690T15 p = new P690T15();
		new Thread() {
			public void run() {
				p.f();
			}
		}.start();
		new Thread() {
			public void run() {
				p.g();
			}
		}.start();
		new Thread() {
			public void run() {
				p.h();
			}
		}.start();
	}
}
