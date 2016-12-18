package com.leetcode.code;


public class Main209 {
	public static void main(String args[]) {
		int s = 7;
		int nums[] = {2,3,1,2,4,3,7};
		System.out.println(minSubArrayLen(s,nums));
	}
	public static int minSubArrayLen(int s,int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int l=0,r=0;
		while(l<nums.length && r<nums.length) {
			while(r<nums.length && sum<s) {
				sum += nums[r++];
			}
			while(l<nums.length && sum>=s) {
				min = Math.min(min, r-l);
				sum -= nums[l++];
			}
		}
		return min == Integer.MAX_VALUE? 0 : min;
	}
	/** 
	 * @Description 暴力解法，不懂为什么错了
	 * @author hlz
	 * @param s
	 * @param nums
	 * @return  
	 */
	  	
	public static int minSubArrayLen1(int s,int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			int l=i,r=i;
			sum = nums[i];
			while(sum < s) {
				if(l == 0) {
					if(r < nums.length-1) {
						r++;
						sum += nums[r];
					} else {
						return 0;
					}
				}
				if(r == nums.length-1) {
					if(l > 0) {
						l--;
						sum += nums[l];
					}
				}
				if(l>0 && r<nums.length-1) {
					if(nums[l-1] > nums[r+1]) {
						l--;
						sum += nums[l];
					} else {
						r++;
						sum += nums[r];
					}
				}
			}
			min = Math.min(min, r-l+1);
		}
		return min;
	}
}
