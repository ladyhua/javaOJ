package com.leetcode.code;

public class Main53 {
	public static void main(String args[]) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	public static int maxSubArray(int[] nums) {
		int local = nums[0];
		int global = nums[0];
		for(int i=1; i<nums.length; i++) {
			local = Math.max(nums[i], nums[i]+local);
			global = Math.max(local, global);
		}
		return global;
	}
}
