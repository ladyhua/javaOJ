package com.thinking.in.java.code;

public class P49T10 {
	public static void main(String[] args) {
		int i = 0xAAAAAAAA;
		int j = 0x55555555;
		System.out.print("i & j = ");
		System.out.println(Integer.toBinaryString(i & j));
		System.out.print("i | j = ");
		System.out.println(Integer.toBinaryString(i | j));
		System.out.print("i ^ j = ");
		System.out.println(Integer.toBinaryString(i ^ j));
		System.out.print("~i = ");
		System.out.println(Integer.toBinaryString(~i));
	}
}
