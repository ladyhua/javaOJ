package com.leetcode.code;

public class Main238 {
	public static void main(String args[]) {
		int[] nums = {1,2,3,4};
		int[] output = productExceptSelf(nums);
		for(int i : output) {
			System.out.print(i + " ");
		}
	}
	public static int[] productExceptSelf(int[] nums) {
		int[] output = new int[nums.length];
		output[0] = 1;
		for(int i=1; i<nums.length; i++) {
			output[i] = output[i-1] * nums[i-1];
		}
		int rightProduct = 1;
		for(int i=nums.length-2; i>=0; i--) {
			rightProduct *= nums[i+1];
			output[i] *= rightProduct;
		}
		return output;
	}
}
