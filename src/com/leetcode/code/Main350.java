package com.leetcode.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main350 {
	public static void main(String args[]) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] res = intersect(nums1,nums2);
		for(int i : res) {
			System.out.print(i + " ");
		}
	}
	public static int[] intersect(int[] nums1,int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i : nums1) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		for(int i : nums2) {
			if(map.containsKey(i) && map.get(i) > 0) {
				list.add(i);
				map.put(i, map.get(i) - 1);
			}
		}
		int[] res = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			res[i] = list.get(i);
		}
		return res;
	}
}
