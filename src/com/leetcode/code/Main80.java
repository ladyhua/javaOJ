package com.leetcode.code;

public class Main80 {
	public static void main(String args[]) {
		int[] nums = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(nums));
	}
	public static int removeDuplicates(int[] nums) {
		if(nums == null || nums.length < 1) {
			return 0;
		}
		if(nums.length == 1) {
			return 1;
		}
		int[] res = new int[nums.length];
		res[0] = nums[0];
		int count = 1;
		for(int i=1; i<nums.length; i++) {
			if(nums[i] != res[count-1]) {
				res[count++] = nums[i];
			} else {
				if(count < 2 || count >=2 && res[count-2] != nums[i]) {
					res[count++] = nums[i];
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			nums[i] = res[i];
		}
		return count;
    }
}
