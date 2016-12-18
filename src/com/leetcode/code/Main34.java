package com.leetcode.code;

public class Main34 {
	public static void main(String args[]) {
		int[] nums = {5,7,7,8,8,10};
		int[] res = new int[2];
		res = searchRange(nums,8);
		System.out.println(res[0] + " " + res[1]);
	}
	public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int i = 0,j = nums.length-1;
        int mid = (i + j)/2;
        while(i < j) {
        	if(nums[mid] > target) {
        		j = mid - 1;
        		mid = (i + j)/2;
        	} else if(nums[mid] < target){
        		i = mid + 1;
        		mid = (i + j)/2;
        	} else {
        		i = mid - 1;
        		j = mid + 1;
        		while(i > -1) {
        			if(nums[i] == target) {
        				i--;
        			} else {
        				break;
        			}
        		}
        		while(j < nums.length) {
        			if(nums[j] == target) {
        				j++;
        			}else {
        				break;
        			}
        		}
        		break;
        	}
        }
        if(i == j && nums[i] == target) {
        	res[0] = i;
        	res[1] = i;
        } else if(i == j && nums[i] != target || i > j){
        	res[0] = -1;
        	res[1] = -1;
        } else if(i < j) {
        	res[0] = i + 1;
        	res[1] = j - 1;
        }
        return res;
    }		
}
