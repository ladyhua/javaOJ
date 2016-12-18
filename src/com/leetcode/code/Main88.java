package com.leetcode.code;

public class Main88 {
	public static void main(String args[]) {
		int[] nums1 = new int[100];
		for(int i=0; i<5; i++) {
			nums1[i] = i;
		}
		int[] nums2 = {1,3,5,7,9};
		int m = 5;
		int n = 5;
		merge(nums1,m,nums2,n);
		for(int i=0; i<m+n; i++) {
			System.out.print(nums1[i] + " ");
		}
	}
	public static void merge(int[] nums1,int m,int[] nums2,int n) {
		int[] res = new int[m+n];
		int count = 0;
		int count1 = 0,count2 = 0;
		while(count1 < m && count2 < n) {
			if(nums1[count1] < nums2[count2]) {
				res[count++] = nums1[count1++]; 
			} else {
				res[count++] = nums2[count2++];
			}
		}
		if(count1 < m) {
			for(int i=count1; i<m;i++ ) {
				res[count++] = nums1[i];
			}
		}
		if(count2 < n) {
			for(int i=count2; i<n; i++) {
				res[count++] = nums2[i];
			}
		}
		for(int i=0; i<m+n; i++) {
			nums1[i] = res[i];
		}
	}
}
