package com.leetcode.code;

public class Main162 {
	public static void main(String args[]) {
		int[] nums = {1,2,3,1};
		System.out.println(findPeakElement(nums));
	}
	
	public static int findPeakElement(int[] nums) {
		if(nums == null || nums.length == 0) return -1;
		int i=0,j=nums.length-1;
		while(i <= j) {
			if(i == j) return i;
			int mid = (i + j) / 2;
			if(nums[mid] < nums[mid+1]) {
				i = mid + 1;
			} else {
				j = mid;
			}
		}
		return -1;
	}
	/** 
	 * @Description 拙略的算法 
	 * @author hlz
	 * @param nums
	 * @return  
	 */
	  	
	public static int findPeakElement1(int[] nums) {
		if(nums == null || nums.length == 0) return -1;
		if(nums.length == 1) return 0;
		if(nums[0] > nums[1]) return 0;
		if(nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;
		for(int i=1; i<nums.length-1; i++) {
			if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) {
				return i;
			}
		}
		return -1;
	}
}
