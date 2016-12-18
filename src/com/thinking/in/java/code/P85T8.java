package com.thinking.in.java.code;

public class P85T8 {
	public void method1() {
		method2();
		this.method2();
	}
	
	public void method2() {
		System.out.println("test this");
	}
	public static void main(String[] args) {
		P85T8 p = new P85T8();
		p.method1();
	}
}
