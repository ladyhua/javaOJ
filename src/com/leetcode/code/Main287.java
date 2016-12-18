package com.leetcode.code;

public class Main287 {
	public static void main(String args[]) {
		int[] nums = {1,2,3,4,5,6,3};
		System.out.println(findDuplicate(nums));
	}
	public static int findDuplicate(int[] nums) {
		int l = 1;
		int r = nums.length - 1;
		int count = 0;
		while(l < r) {
			int mid = (l + r) / 2;
			count = 0;
			for(int i : nums) {
				if(i <= mid) count++;
			}
			if(count > mid) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}
}
