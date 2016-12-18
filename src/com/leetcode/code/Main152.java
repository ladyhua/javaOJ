package com.leetcode.code;

public class Main152 {
	public static void main(String args[]) {
		int[] nums = {2,3,-2,4};
		System.out.println(maxProduct(nums));
	}
	public static int maxProduct(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int localMax = nums[0];
		int localMin = nums[0];
		int global = nums[0];
		for(int i=1; i<nums.length; i++) {
			int localCopy = localMax;
			localMax = Math.max(Math.max(nums[i], nums[i]*localMax), nums[i]*localMin);
			localMin = Math.min(Math.min(nums[i], nums[i]*localCopy), nums[i]*localMin);
			global = Math.max(global, localMax);
		}
		return global;
	}
}
