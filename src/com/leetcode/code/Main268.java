package com.leetcode.code;

public class Main268 {
	public static void main(String args[]) {
		int[] nums = {4,1,2,6,5,0};
		System.out.println(missingNumber(nums));
	}
	public static int missingNumber(int[] nums) {
		int res = nums[0];
		for(int i=1; i<nums.length; i++) {
			res ^= nums[i];
			res ^= i;
		}
		return res ^nums.length;
		
	}
	public static int missingNumber1(int[] nums) {
		double d = nums.length;
		double sum = d * (d + 1) / 2;
		for(int i=0; i<nums.length; i++) {
			sum -= nums[i];
		}
		return (int)sum;
	}
}
