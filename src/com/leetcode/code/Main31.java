package com.leetcode.code;

import java.util.Arrays;

public class Main31 {
	public static void main(String args[]) {
		int[] nums = {1,5,1};
		nextPermutation(nums);
	}
	public static void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while(i>0) {  //从后往前找到第一个非递增的数
        	if(nums[i-1] < nums[i]) {
        		break;
        	} else 
        		i--;
        }
        int j = nums.length - 1;
        if(i == 0) {  //如果整个数组从后往前都是非递增的就倒叙整个数组
        	Arrays.sort(nums);
        }else { //否则找到第一个大于a[i-1]的数
        	while(j > i-1) {
        		if(nums[j] > nums[i-1]) {
        			break;
        		} else {
        			j--;
        		}	
        	}
        	int temp = nums[i-1];
        	nums[i-1] = nums[j];
        	nums[j] = temp;
        	Arrays.sort(nums, i, nums.length);
        }
        for(int t : nums) {
        	System.out.print(t + " ");
        }
    }
}
