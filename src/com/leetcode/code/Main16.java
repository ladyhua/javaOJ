package com.leetcode.code;
//AC
import java.util.Arrays;

public class Main16 {
	public static void main(String args[]) {
		int[] ints = {0,2,1,-3};
		System.out.println(threeSumClosest(ints,1));
	}
	public static int threeSumClosest(int[] nums, int target) {
		int sum = Integer.MAX_VALUE;
		int[] ints = new int[3];
		Arrays.sort(nums);
		for(int i=nums.length-1; i>1; i--) {
			if(i<nums.length-1 && nums[i] == nums[i+1]) continue;
			int[] twoSum = twoSumClosest(nums,i-1,target-nums[i]);
			int temp = Math.abs(twoSum[0] + twoSum[1] + nums[i] - target);
			if(temp < sum) {
				sum = temp;
				ints[0] = twoSum[0];
				ints[1] = twoSum[1];
				ints[2] = nums[i];
			}
		}
		return ints[0] + ints[1] + ints[2];
    }
	private static int[] twoSumClosest(int[] nums, int end, int target) {
		// TODO Auto-generated method stub
		int[] ints = new int[2];
		int i = 0,j = end;
		int sum = Integer.MAX_VALUE;
		while(i < j) {
			int temp = Math.abs(nums[i] + nums[j] - target);
			if(temp < sum) {
				sum = temp;
				ints[0] = nums[i];
				ints[1] = nums[j];
			}
			if(nums[i] + nums[j] == target) {
				return ints;
			} else if(nums[i] + nums[j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return ints;
	}
}
