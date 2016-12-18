package com.leetcode.code;

public class Main136 {
	public static void main(String args[]) {
		int nums[] = {1,1,2,2,3,3,4,5,6,7,8,9,4,5,6,7,8};
		System.out.println(singleNumber(nums));
	}
	public static int singleNumber(int[] nums) {
		int res = 0;
		for(int i : nums) {
			res ^= i;
		}
		return res;
	}
}
