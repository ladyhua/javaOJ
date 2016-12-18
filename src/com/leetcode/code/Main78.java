package com.leetcode.code;

import java.util.ArrayList;
import java.util.List;

public class Main78 {
	public static void main(String args[]) {
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		helper(nums,0,res);
		return res;
	}
	public static void helper(int[] nums,int start,List<List<Integer>> res) {
		if(start == nums.length) {
			res.add(new ArrayList<Integer>());
			return;
		} else {
			helper(nums,start+1,res);
			int size = res.size();
			for(int i=0; i<size; i++) {
				List<Integer> list = new ArrayList<Integer>(res.get(i));
				list.add(nums[start]);
				res.add(list);
			}
		}
	}
	/** 
	 * @Description 非递归解法 
	 * @author hlz
	 * @param nums
	 * @return  
	 */
	  	
	public static List<List<Integer>> subsets1(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		for(int i=0; i<nums.length; i++) {
			int size = res.size();
			for(int j=0; j<size; j++) {
				List<Integer> list = new ArrayList<Integer>(res.get(j));
				list.add(nums[i]);
				res.add(list);
			}
		}
		return res;
	}
}
