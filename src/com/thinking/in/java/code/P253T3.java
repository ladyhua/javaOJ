package com.thinking.in.java.code;

public class P253T3 {
	public static void main(String args[]) {
		int[] ints= new int[8];
		try {
			System.out.println(ints[8]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println(aioobe.getMessage());
			aioobe.printStackTrace();
		}
	}
}
