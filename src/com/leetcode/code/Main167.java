package com.leetcode.code;

public class Main167 {
	public static void main(String args[]) {
		int[] numbers = {2,7,11,15};
		int[] res = twoSum(numbers,13);
		System.out.println(res[0] + " " + res[1]);
	}
	public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if(numbers == null || numbers.length < 2) return res;
        int l = 0,r = numbers.length-1;
        while(l < r) {
        	if(numbers[l] + numbers[r] == target) {
        		res[0] = l+1;
        		res[1] = r+1;
        		return res;
        	} else if(numbers[l] + numbers[r] < target) {
        		l++;
        	} else {
        		r--;
        	}
        }
        return res;
    }
}
