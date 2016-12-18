package com.leetcode.code;

import java.util.HashSet;
import java.util.Set;

public class Main202 {
	public static void main(String args[]) {
		int n = 3;
		System.out.println(isHappy(n));
	}
	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while(n != 1) {
			if(set.contains(n)) return false;
			else set.add(n);
			int sum = 0;
			while(n != 0) {
				sum += (n % 10) * (n % 10);
				n /= 10;
			}
			n = sum;
		}
		return true;
	}
}
