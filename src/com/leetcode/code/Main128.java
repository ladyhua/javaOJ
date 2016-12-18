package com.leetcode.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main128 {
	public static void main(String args[]) {
		int[] nums = {5,4,4,1,3,2,0,100,6,-1};
		System.out.println(longestConsecutive(nums));
	}
	public static int longestConsecutive(int[] nums) {
		if(nums == null || nums.length ==0) {
			return 0;
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			set.add(i);
		}
		int max = 0;
		while(!set.isEmpty()) {
			Iterator<Integer> it = set.iterator();
			int length = 1;
			int item = (int)it.next();
			it.remove();
			int i = item;
			while(set.contains(++i)) {
				set.remove(i);
				length++;
			}
			i = item;
			while(set.contains(--i)) {
				set.remove(i);
				length++;
			}
			max = Math.max(max, length);
		}
		return max;
	}
	/** 
	 * @Description 复杂度O(nlogn)题目要求O(n),却击败了95%的人，不解
	 * @author hlz
	 * @param nums
	 * @return  
	 */
	  	
	public static int longestConsecutive2(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		Arrays.sort(nums);
		int start = nums[0];
		int length = 1;
		int max = 1;
		for(int i=1; i<nums.length; i++) {
			if(nums[i] == start) {
				continue;
			} else if(nums[i] == ++start){
				length++;
			} else {
				start = nums[i];
				max = Math.max(max,length);
				length = 1;
			}
		}
		max = Math.max(max, length);
		return max;
	}
	/** 
	 * @Description 想用空间换时间，失败
	 * @author hlz
	 * @param nums
	 * @return  
	 */
	  	
	public static int longestConsecutive1(int[] nums) {
		int[] res = new int[Integer.MAX_VALUE-Integer.MIN_VALUE];
		for(int i=0; i<nums.length; i++)  {
			res[nums[i]-Integer.MIN_VALUE] = 1;
		}
		int start,max=0;
		int i=0;
		while(i < res.length) {
			if(res[i] != 1) i++;
			if(res[i] == 1) {
				start = i;
				while(i<res.length && res[i] == 1) i++;
				max = Math.max(max, i-start);
			}
		}
		return max;
	}
}
