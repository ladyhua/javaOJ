package com.leetcode.code;

import java.util.ArrayList;
import java.util.List;

public class Main229 {
	public static void main(String args[]) {
		int[] nums = {2,2,1,3};
		System.out.println(majorityElement(nums));
	}
	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		if(nums == null || nums.length == 0) return res;
		int count1 = 0;
		int count2 = 0;
		int major1 = Integer.MAX_VALUE;
		int major2 = Integer.MAX_VALUE;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == major1) count1++;
			else if(nums[i] == major2) count2++;
			else if(count1 == 0) {
				major1 = nums[i];
				count1 = 1;
			} else if(count2 == 0) {
				major2 = nums[i];
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
			
		}
		count1 = 0;
		count2 = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == major1) count1++;
			if(nums[i] == major2) count2++;
		}
		if(count1 > nums.length / 3) res.add(major1);
		if(count2 > nums.length / 3) {
			if(major1 != major2)
			res.add(major2);
		}
		return res;
	}
}
