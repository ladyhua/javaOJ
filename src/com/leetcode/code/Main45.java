package com.leetcode.code;

public class Main45 {
	public static void main(String args[]) {
		int[] nums = {2,3,1,1,4};
		System.out.println(jump(nums));
	}
	public static int jump(int[] nums) {
		int reach = 0;
		int lastReach = 0;
		int step = 0;
		for(int i=0; i<=reach&&i<nums.length;i++) {
			if(i > lastReach) {
				step++;
				lastReach = reach;
			}
			reach = Math.max(reach, nums[i] + i);
		}
		return step;
	}
}
