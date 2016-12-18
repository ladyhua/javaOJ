package com.thinking.in.java.code;

public class P253T5 {
	private static int[] ints = new int[2];
	private static int index = 5;
	public static void main(String[] args) {
		while(true) {
			try {
				System.out.println(ints[index]);
				break;
			} catch (ArrayIndexOutOfBoundsException aioobe) {
				aioobe.printStackTrace();
				index--;
			} finally {
				System.out.println("Exception catched");
			} 
		}
		System.out.println("out of while");
	}
}
