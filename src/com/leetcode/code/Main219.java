package com.leetcode.code;

import java.util.HashSet;
import java.util.Set;

public class Main219 {
	public static void main(String args[]) {
		int[] nums = {1,2,3,4,1,2,3,4};
		System.out.println(containsNearbyDuplicate(nums,3));
	}
	public static boolean containsNearbyDuplicate(int[] nums,int k) {
		Set<Integer> set = new HashSet<Integer>();
		if(nums == null || nums.length == 0) return false;
		int l=0,r=0;
		while(r < nums.length) {
			if(!set.contains(nums[r])) {
				set.add(nums[r++]);
			} else {
				while(nums[l] != nums[r]) {
					set.remove(nums[l++]);
				}
				if(r - l <= k) return true;
				else set.remove(nums[l++]);
			}
		}
		return false;
	}
}
