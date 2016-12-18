package com.leetcode.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main347 {
	public static void main(String args[]) {
		int[] nums = {1,1,1,2,2,3};
		int k = 2;
		System.out.println(topKFrequent(nums,k));
	}
	public static List<Integer> topKFrequent(int[] nums,int k) {
		List<Integer> res = new ArrayList<Integer>();
		if(nums == null || nums.length == 0) return res;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		List<Integer>[] lists = new List[nums.length+1];
		for(int i : map.keySet()) {
			if(lists[map.get(i)] == null) {
				lists[map.get(i)] = new ArrayList<Integer>();
			}
			lists[map.get(i)].add(i);
		}
		for(int i=nums.length; i>0; i--) {
			if(lists[i] != null && res.size()<k) {
				res.addAll(lists[i]);
			}
		}
		return res;
	}
}
