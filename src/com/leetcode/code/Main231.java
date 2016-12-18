package com.leetcode.code;

public class Main231 {
	public static void main(String args[]) {
		int n = -2147483648;
		System.out.println(isPowerOfTwo(n));
	}
	public static boolean isPowerOfTwo(int  n) {
		if(n < 0) return false;
		String s= Integer.toBinaryString(n);
		int count = 0;
		for(char c : s.toCharArray()) {
			if(c == '1') {
				count++;
			}
		}
		return count == 1;
	}
}
