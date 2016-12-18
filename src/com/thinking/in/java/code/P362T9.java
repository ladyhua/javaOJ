package com.thinking.in.java.code;

public class P362T9 {
	public <V,W> void f(String s,V v,W w) {
		System.out.println(s.getClass().getSimpleName() + " " + v.getClass().getSimpleName() + " " + w.getClass().getSimpleName());
		
	}
	public static void main(String args[]) {
		P362T9 p = new P362T9();
		p.f("hua", 1, 2.2);
	}
}
