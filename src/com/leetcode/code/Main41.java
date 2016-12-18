package com.leetcode.code;

import java.util.Arrays;

public class Main41 {
	public static void main(String args[]) {
		int[] nums = {1,2,0};
		System.out.println(firstMissingPositive(nums));
	}
	public static int firstMissingPositive(int[] nums) {
        int i = 0;
        Arrays.sort(nums);
		while(i < nums.length) {
			if(nums[i] > 0) {
				break;
			} else {
				i++;
			}
		}
		if(i == nums.length || nums[i] != 1) {
			return 1;
		}
		int value = nums[i];
		for(int j = i; j<nums.length; j++) {
			if(nums[j] == value) {
				value++;
			}
		}
		return value;
    }
}
