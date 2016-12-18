package com.leetcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//AC
public class Main15 {
	public static void main(String args[]) {
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=nums.length-1; i>1; i--) {
			if(i < nums.length-1 && nums[i] == nums[i+1]) continue;
			List<List<Integer>> twoList = twoSum(nums,i-1,-nums[i]);
			for(List<Integer> lTemp : twoList) {
				lTemp.add(nums[i]);
			}
			l.addAll(twoList);
		}
		return l;
	}
	private static List<List<Integer>> twoSum(int[] nums, int end, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int i = 0,j = end;
		while(i < j) {
			if(nums[i] + nums[j] > target) {
				j--;
			} else if(nums[i] + nums[j] < target) {
				i++;
			} else {
				List<Integer> ll = new ArrayList<Integer>();
				ll.add(nums[i]);
				ll.add(nums[j]);
				list.add(ll);
				i++;
				j--;
				while(i<j && nums[i] == nums[i-1]) i++;
				while(i<j && nums[j] == nums[j+1]) j--;
			}
		}
		return list;
	}

	/** 
	 * @Description 超时 
	 * @author hlz
	 * @param nums
	 * @return  
	 */
	  	
	public static List<List<Integer>> threeSum1(int[] nums) {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int sum = -1;
		
		for(int i=0; i<nums.length-2; i++) {
			for(int j=i+1; j< nums.length-1; j++) {
				for(int k=nums.length-1; k>j;k--) {
					sum = nums[i] + nums[j] + nums[k];
					if(sum < 0) break; 
					if(sum == 0) {
						List<Integer> lTemp = new ArrayList<Integer>();
						lTemp.add(nums[i]);
						lTemp.add(nums[j]);
						lTemp.add(nums[k]);
						if(!l.contains(lTemp))
						l.add(lTemp);
					}
				}
			}
		}
		return l;
	}
}
