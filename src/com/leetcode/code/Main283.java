package com.leetcode.code;

public class Main283 {
	public static void main(String args[]) {
		int[] nums = {0,1,0,3,12};
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				nums[count++] = nums[i];
			}
		}
		for(int i=count; i<nums.length; i++) {
			nums[i] = 0;
		}
	}
}
