package com.thinking.in.java.code;

public class P194T5 {
	public static void main(String[] args) {
		Outer outer = new Outer("ladyhua");
		Outer.Inner oi = outer.new Inner();
		oi.toString();
	}
}
