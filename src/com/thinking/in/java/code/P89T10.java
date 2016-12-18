package com.thinking.in.java.code;

public class P89T10 {
	protected void finalize() {
		System.out.println("finalizing!!!");
	}
	
	public static void main(String args[]) {
		P89T10 p = new P89T10();
		System.out.println(p);
		p = null;
		System.gc();
	}
}
