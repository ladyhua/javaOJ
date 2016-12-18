package com.leetcode.code;

import java.util.ArrayList;
import java.util.List;

public class Main228 {
	public static void main(String args[]) {
		int[] nums = {0,1,2,4,5,7};
		System.out.println(summaryRanges(nums));
	}
	public static List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<String>();
		if(nums == null || nums.length == 0) return res;
		int left = nums[0];
		int right = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i] != ++right) {
				if(left == right-1) {
					res.add(left + "");
				} else {
					res.add(left + "->" + (right-1));
				}
				left = nums[i];
				right = left;
			}
		}
		if(nums[nums.length-1] == left) {
			res.add(left+"");
		} else {
			res.add(left + "->" + nums[nums.length-1]);
		}
		return res;
	}
}
