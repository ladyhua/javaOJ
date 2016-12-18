package com.leetcode.code;

public class Main35 {
	public static void main(String args[]) {
		int[] nums = {1,3,5,6};
		System.out.println(searchInsert(nums,5));
	}
	 
	/** 
	 * @Description用二分查找效率稍有提高 
	 * @author hlz
	 * @param nums
	 * @param target
	 * @return  
	 */
	  	
	public static int searchInsert(int[] nums, int target) {
		int i = 0,j = nums.length - 1;
		int mid = (i + j)/2;
		while(i < j) {
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] < target){
				i = mid + 1;
				mid = (i + j) / 2;
			} else {
				j = mid - 1;
				mid = (i + j) / 2;
			}
		}
		if(nums[mid] < target)
			mid++;
		return mid;
	}
	/** 
	 * @Description 通过但效率太低
	 * @author hlz
	 * @param nums
	 * @param target
	 * @return  
	 */
	  	
	public static int searchInsert1(int[] nums, int target) {
        int i = 0;
        while(i < nums.length) {
        	if(nums[i] >= target) {
        		break;
        	} else if(nums[i] < target) {
        		i++;
        	}
        }
		return i;
    }
}
