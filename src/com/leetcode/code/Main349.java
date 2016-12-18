package com.leetcode.code;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main349 {
	public static void main(String args[]) {
		int nums1[] = {1,2,2,1};
		int nums2[] = {2,2};
		int[] res = intersection(nums1,nums2);
		for(int i : res) {
			System.out.println(i + " ");
		}
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> res = new HashSet<Integer>();
		for(int i : nums1) {
			set.add(i);
		}
		for(int i : nums2) {
			if(set.contains(i)) {				
				res.add(i);
			}
		}
		int[] result = new int[res.size()];
		Iterator<Integer> it = res.iterator();
		int count = 0;
		while(it.hasNext()) {
			int i = it.next();
			result[count++] = i;
		}
		return result;
	}
}
