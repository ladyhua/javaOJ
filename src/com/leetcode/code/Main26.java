package com.leetcode.code;

public class Main26 {
	public static void main(String args[]) {
		int[] ints = {1,1,1,1,1,1,1};
		System.out.println(removeDuplicates(ints)); 
	}
	
	public static int removeDuplicates(int[] nums) {
		if(nums.length < 2) {
			return nums.length;
		}
		int i = 0,j = 1;
		while(j<nums.length) {
			if(nums[i] == nums [j]) {
				j++;
			} else if(nums[i] < nums[j]) {
				nums[i+1] = nums[j];
				i++;
				j++;
			}
		}
		return i + 1;
	}
	/** 
	 * @Description 自己写的方法，实在渣渣
	 * @author hlz
	 * @param nums
	 * @return  
	 */
	  	
	public static int removeDuplicates1(int[] nums) {
        if(nums.length < 2) {
        	return nums.length;
        }
        int i = 0,count = 0;
        while(nums[i] <= nums[i+1] ) {
        	if(nums[i] < nums[i+1]) {
        		if(i < nums.length - 2 - count)
        			i++;
        		else
        			break;
        		continue;
        	} else {
        		int temp = nums[i+1];
        		for(int j=i+1; j<nums.length-1; j++) {
        			nums[j] = nums[j+1];
        		}
        		count ++ ;
        		nums[nums.length-1] = temp;
        		
        	}
        }
        //i = 0;
        /*while(nums[i] < nums[i+1] ) {
        	if(i < nums.length - 2)
        		i++;
        	else 
        		break;
        }*/
        return nums.length-count;
    }
}
