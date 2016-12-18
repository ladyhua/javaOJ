package com.leetcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main90 {
	public static void main(String args[]) {
		int[] nums = {4,4,4,1,4};
		System.out.println(subsetsWithDup(nums));;
	}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		res.add(new ArrayList<Integer>());
		int lastSize = 0;
		int size = 0;
		int start;
		for(int i=0; i<nums.length; i++) {
			if(i > 0 && nums[i] == nums[i-1])
				start = lastSize;
			else {
				start = 0;
			}
			size = res.size();
			for(int j=start; j<size; j++) {
				List<Integer> list = new ArrayList<Integer>(res.get(j));
				list.add(nums[i]);
				res.add(list);
			}
			lastSize = size;
		}
		return res;
	}
}
