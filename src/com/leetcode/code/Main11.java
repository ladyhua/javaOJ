package com.leetcode.code;
//AC
public class Main11 {
	public static void main(String args[]) {
		int a[] = {1,1,2};
		System.out.println(maxArea(a));
	}
	
	
	public static int maxArea(int[] height) {
		int max = 0;
		int i = 0;
		int j = height.length - 1;
		while(i < j) {
			int area = (j - i) * (height[i] < height[j]? height[i] : height[j]);
			if(area > max) max = area;
			if(height[i] < height[j]) { //如果短板在i，那么移动j不可能找到比目前area更大的值了，只能移动i
				i++;
			} else {	//反之，只能移动j
				j--;
			}
		}
		return max;
	}
}
