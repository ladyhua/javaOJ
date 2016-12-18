package com.leetcode.code;

public class Main153 {
	public static void main(String args[]) {
		int[] nums = {4,5,6,7,0};
		System.out.println(findMin(nums));
	}
	public static int findMin(int[] nums) {
		if(nums == null || nums.length == 0) return Integer.MAX_VALUE;
		int i = 0,j = nums.length - 1;
		int min = nums[0];
		while(i < j - 1) {
			int mid = (i + j) / 2;
			if(nums[mid] > nums[i]) {
				min = Math.min(min, nums[i]);
				i = mid + 1; 
			} else {
				min = Math.min(nums[mid], min);
				j = mid - 1;
			}
		}
		min = Math.min(nums[i], min);
		min = Math.min(nums[j], min);
		return min;
	}
}
