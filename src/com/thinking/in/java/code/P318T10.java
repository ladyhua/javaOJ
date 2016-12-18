package com.thinking.in.java.code;

public class P318T10 {
	public static void main(String args[]) {
		char[] chars = { 'a','b' };
		//char c = 'a';
		Child c = new Child();
		//-[[vObject obj = new Object();
		System.out.println(c.getClass());
		System.out.println(chars.getClass() instanceof Object);
		System.out.println(chars.getClass().getSuperclass());
		System.out.println(char.class+ " " + Character.TYPE);
		System.out.println(Object.class.isInstance(c));
		
	}
}
