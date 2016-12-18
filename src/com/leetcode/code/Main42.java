package com.leetcode.code;

public class Main42 {
	public static void main(String args[]) {
		int[] height = {5,2,1,2,1,5};
		System.out.println(trap(height));
	}
	public static int trap(int[] height) {
		int res = 0;
		int max = 0;
		int[] container = new int[height.length];
		for(int i=0; i<height.length;i++) {
			container[i] = max;
			max = Math.max(max, height[i]);
		}
		max = 0;
		for(int i=height.length-1; i>-1;i--) {
			container[i] = Math.min(max, container[i]);
			max = Math.max(max, height[i]);
			res += container[i] > height[i]? container[i]-height[i] : 0;
		}
		return res;
	}
	/** 
	 * @Description 失败
	 * @author hlz
	 * @param height
	 * @return  
	 */
	  	
	public static int trap1(int[] height) {
		int i = 0,j = height.length - 1;
		while(i < height.length - 1 && height[i] <= height[i+1]) i++;
		while(j > 0 && height[j] <= height[j-1]) j--;
		if(i == height.length || j == 0 || j <= i) return 0;
		int trap = 0;
		while(i < j) {
			int k = i;
			while(k < j && height[k] >= height[k+1]) k++;
			int mid = k;
			while(k < j && height[k] <= height[k+1]) k++;
			int area = computeArea(height,i,mid,k);
			trap += area;
			i = k;
		}
		return trap;
	}
	private static int computeArea(int[] height,int i,int mid,int j) {
		int start,end;
		if(height[i] > height[j]) {
			end = j;
			while(mid >= i && height[mid] < height[j]) mid--;
			start = mid;
		} else {
			start = i;
			while(mid <= j && height[mid] < height[i]) mid++;
			end = mid;
		}
		int allArea = (end-start-1) * (height[end] > height[start]? height[start] : height[end]);
		int subArea = 0;
		for(int k=start+1; k<end; k++) {
			subArea += height[k];
		}
		return allArea - subArea;
	}
}
