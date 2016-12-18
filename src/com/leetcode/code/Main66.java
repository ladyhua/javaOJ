package com.leetcode.code;

public class Main66 {
	public static void main(String args[]) {
		int[] digits = {9,9,8,9,9};
		int[] res = plusOne(digits);
		for(int i : res) {
			System.out.print(i);
		}
	}
	public static int[] plusOne(int[] digits) {
		boolean carry = false;
		int i;
		for(i=digits.length-1; i>=0; i--) {
			if(digits[i] == 9) {
				carry = true;
				digits[i] = 0;
			} else {
				carry = false;
				digits[i]++;
				break;
			}
		}
		if(i == -1 && carry == true) {
			int[] res = new int[digits.length+1];
			res[0] = 1;
			for(int j=1; j<res.length; j++) {
				res[j] = 0;
			}
			return res;
		}
		return digits;
	}
}
