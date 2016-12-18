package com.thinking.in.java.code;

class MyException extends Exception{
	private String s;
	public MyException() {
		
	}
	public MyException(String s) {
		super(s);
		this.s = s;
	}
	public void printString() {
		System.out.println(s);
	}
}
public class P253T4 {
	public static void main(String args[]) {
		try {
			throw new MyException("test MyException");
		} catch(MyException me) {
			me.printString();
		}
	}
}
