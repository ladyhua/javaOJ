package com.leetcode.code;

import java.util.Arrays;
//AC
public class Main1 {
	public static void main(String[] args) {
		int[] nums = {0,4,3,0};
		int target = 0;
		twoSum(nums,target);
	}
	
	public static  int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] copyNums = nums.clone();
        Arrays.sort(copyNums);
        int status = 0;
        int firstValue = -1,secondValue = -1;
        for(int i=0; i<copyNums.length-1; i++) {
        	for(int j=i+1; j<copyNums.length; j++) {
        		if(copyNums[i]+copyNums[j]>target) {
        			break;
        		}else if(copyNums[i]+copyNums[j]==target) {
        			firstValue = copyNums[i];
        			secondValue = copyNums[j];
        			status = 1;
        			break;
        		}
        	}
        	if(status == 1) {
        		break;
        	}
        }
        result=searchIndex(nums,firstValue,secondValue);
        System.out.println(result[0]+" "+result[1]);
        return result;
    }

	private static int[] searchIndex(int[] nums, int firstValue, int secondValue) {
		// TODO Auto-generated method stub
		int[] result = new int[2];
		if(firstValue != secondValue){
			for(int i=0; i<nums.length; i++) {
				if(nums[i]==firstValue) {
					result[0] = i+1;
				}else if(nums[i]==secondValue) {
					result[1] = i+1;
				}
			}
		}else {
			boolean b = false;
			for(int i=0; i<nums.length; i++) {
				if(nums[i] == firstValue) {
					if(!b) {
						result[0] = i+1;
						b = true;
					}else {
						result[1] = i+1;
					}
				}
			}
		}
		if(result[0]>result[1]) {
			int temp = result[0];
			result[0] = result[1];
			result[1] = temp;
		}
		return result;
	}
}

