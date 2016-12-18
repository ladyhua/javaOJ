package com.leetcode.code;

public class Main169 {
	public static void main(String args[]) {
		int[] nums = {3,1,3,1,3};
		System.out.println(majorityElement(nums));
	}
	public static int majorityElement(int[] nums) {
		if(nums == null || nums.length == 0) return Integer.MAX_VALUE;
		int count = 1;
		int res = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i] == res) {
				count++;
			} else {
				if(--count == 0) {
					res = nums[i];
					count = 1;
				}
			}
			if(count > nums.length / 2)
				return res;
		}
		return res;
	}
}
