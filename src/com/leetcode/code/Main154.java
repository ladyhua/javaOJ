package com.leetcode.code;

public class Main154 {
	public static void main(String args[]) {
		int[] nums = {3,3,3,1};
		System.out.println(findMin(nums));
	}
	public static int findMin(int[] nums) {
		if(nums == null || nums.length == 0) return Integer.MAX_VALUE;
		int min = nums[0];
		int i = 0;
		int j = nums.length - 1;
		while(i < j - 1) {
			int mid = (i + j) / 2;
			if(nums[mid] > nums[i]) {
				min = Math.min(nums[i], min);
				i = mid + 1;
			} else if(nums[mid] < nums[i]) {
				min = Math.min(nums[mid], min);
				j = mid - 1;
			} else 
				i++;
		}
		min = Math.min(nums[i], min);
		min = Math.min(nums[j], min);
		return min;
	}
}
