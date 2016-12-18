package com.leetcode.code;

public class Main27 {
	public static void main(String args[]) {
		int[] nums = {3,2,2,3,2,3,5,3};
		System.out.println(removeElement(nums,3));
	}
	public static int removeElement(int[] nums, int val) {
		if(nums.length == 0) {
			return 0;
		}
		if(nums.length == 1) {
			return nums[0] == val? 0 : 1;
		}
        int i = 0, j = nums.length - 1;
        while(i < j) {
        	if(nums[i] == val) {
        		if(nums[j] == val) {
        			j--;
        		} else {
        			int temp = nums[i];
        			nums[i] = nums[j];
        			nums[j] = temp;
        			i++;
        			j--;
        		}
        	} else {
        		i++;
        	}
        }
		return nums[i] ==  val? i : i + 1;
    }
}
