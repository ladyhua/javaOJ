package com.thinking.in.java.code;

class First {
	public First() {
		System.out.println("First()");
	}
}
class Second {
	private First first;
	public Second() {
		System.out.println("Second()");
	}
	public String toString() {
		if(first == null) {
			first = new First();
		}
		return first + "";
	}
}
public class P127T1 {
	public static void main(String args[]) {
		Second second = new Second();
		System.out.println(second);
	}
}
