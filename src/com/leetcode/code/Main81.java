package com.leetcode.code;

public class Main81 {
	public static void main(String args[]) {
		int[] nums = {3,1,2,3,3,3,3,3,3};
		int target = 1;
		System.out.println(search(nums,target));
	}
	public static boolean search(int[] nums,int target) {
		if(nums == null || nums.length < 1) {
			return false;
		}
		int i = 0,j = nums.length - 1;
		int mid;
		while(i <= j) {
			mid = (i + j) / 2;
			if(nums[mid] == target) {
				return true;
			}
			if(nums[mid] > nums[i]) {
				if(target < nums[mid] && target >= nums[i]) {
					j = mid - 1;
				} else {
					i = mid + 1;
				}
			} else if(nums[mid] < nums[i]) {
				if(target > nums[mid] && target <= nums[j]) {
					i = mid + 1;
				} else {
					j = mid - 1;
				}
			} else {
				i++;
			}
		}
		return false;
	}
}
