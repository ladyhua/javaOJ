package com.leetcode.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main217 {
	public static void main(String args[]) {
		int[] nums = {1,2,3,4,5,6,7,8,1};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/** 
	 * @Description 超时
	 * @author hlz
	 * @param nums
	 * @return  
	 */
	  	
	public static boolean containsDuplicate1(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}
		}
		return false;
	}
}
