package com.leetcode.code;
//AC
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main18 {
	public static void main(String args[]) {
		int[] ints = {1,0,-1,0,-2,2};
		System.out.println(fourSum(ints,0));
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=nums.length-1; i>2; i--) {
        	if(i < nums.length-1 && nums[i] == nums[i+1]) continue;
        	List<List<Integer>> threeList = threeSum(nums,i-1,target-nums[i]);
        	for(List<Integer> lTemp : threeList) {
        		lTemp.add(nums[i]);
        	}
        	l.addAll(threeList);
        }
        return l;
    }
	public static List<List<Integer>> threeSum(int[] nums,int end,int target) {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		for(int i=end; i>1; i--) {
			if(i < end && nums[i] == nums[i+1]) continue;
			List<List<Integer>> twoList = twoSum(nums,i-1,target-nums[i]);
			for(List<Integer> lTemp : twoList) {
				lTemp.add(nums[i]);
			}
			l.addAll(twoList);
		}
		return l;
	}
	private static List<List<Integer>> twoSum(int[] nums, int end, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int i = 0,j = end;
		while(i < j) {
			if(nums[i] + nums[j] > target) {
				j--;
			} else if(nums[i] + nums[j] < target) {
				i++;
			} else {
				List<Integer> ll = new ArrayList<Integer>();
				ll.add(nums[i]);
				ll.add(nums[j]);
				list.add(ll);
				i++;
				j--;
				while(i<j && nums[i] == nums[i-1]) i++;
				while(i<j && nums[j] == nums[j+1]) j--;
			}
		}
		return list;
	}
}
