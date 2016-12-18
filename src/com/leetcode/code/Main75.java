package com.leetcode.code;
//计数排序题，此解法没用计数排序，最好再重做一遍用计数排序

public class Main75 {
	public static void main(String args[]) {
		int[] nums = {1,1};
		sortColors(nums);
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}
	public static void sortColors(int[] nums) {
		if(nums == null || nums.length < 2)
			return;
		int i = 0,j = nums.length - 1;
		while(i < j) {
			while(i < j && nums[i] == 0) i++;
			while(i < j && nums[j] != 0) j--;
			if(i < j) {
				nums[j] = nums[i];
				nums[i] = 0;
				i++;
				j--;
			}
		}
		j = nums.length - 1;
		while(i < j) {
			while(i < j && nums[i] != 2) i++;
			while(i < j && nums[j] == 2) j--;
			if(i < j) {
				nums[i] = nums[j];
				nums[j] = 2;
				i++;
				j--;
			}
		}
	}
}
