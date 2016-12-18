package com.leetcode.code;

public class Main55 {
	public static void main(String args[]) {
		int[] nums = {3,2,1,0,4};
		System.out.println(canJump(nums));
	}
	public static boolean canJump(int[] nums) {
		if(nums == null || nums.length == 0) {
			return false;
		}
		int reach = 0;
		for(int i=0; i<=reach && i<nums.length-1; i++) {
			reach = Math.max(reach, nums[i] + i);
		}
		if(reach >= nums.length-1) {
			return true;
		} else {
			return false;
		}
	}
}
