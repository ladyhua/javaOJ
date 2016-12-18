package com.thinking.in.java.code;

public class P318T8 {
	public static void main(String args[]) {
		Object o = new Object();
		Class c = o.getClass().getSuperclass();
		System.out.println(o.getClass().getName().equals("java.lang.Object"));
	}
}
