package com.thinking.in.java.code;

abstract class Sup {
	Sup() {
		print();
	}
	abstract void print();
}

class Sub extends Sup {
	private int i = 1;
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
}
public class P171T3 {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.print();
	}
}
