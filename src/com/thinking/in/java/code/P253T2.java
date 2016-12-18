package com.thinking.in.java.code;

class TestException {
	void f() {
		
	}
}
public class P253T2 {
	public static void main(String args[]) {
		TestException te = null;
		try {
			te.f();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
}
