package com.thinking.in.java.code;

public class P690T16 {
	Object o1 = new Object();
	Object o2 = new Object();
	public void f() {
		synchronized(this) {
			for(int i=0; i<5; i++) {
				System.out.println("f() : " + i);
				Thread.yield();
			}
		}
	}
	public void g() {
		synchronized(this) {
			for(int i=0; i<5; i++) {
				System.out.println("g() : " + i);
				Thread.yield();
			}
		}
	}
	public void h() {
		synchronized(this) {
			for(int i=0; i<5; i++) {
				System.out.println("h() : " + i);
				Thread.yield();
			}
		}
	}
	
	
	public static void main(String args[]) {
		P690T16 p = new P690T16();
		Thread t1 = new Thread() {
				public void run() {
					p.f();
				}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				p.g();
			}
		};
		t2.start();
		p.h();
	}
}
