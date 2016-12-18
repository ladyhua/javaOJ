package com.thinking.in.java.code;

public class P253T1 {
	public static void main(String args[]) {
		try {
			throw new Exception("sdf");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
	}
}
