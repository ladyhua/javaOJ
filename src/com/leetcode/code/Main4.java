package com.leetcode.code;

public class Main4 {
	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {4,5,6};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = new int[m+n];  
        int medianIndex = (m + n)/2;
        int i = 0,j = 0;
        int count = 0;
        while(i<m || j<n) {
        	if(i == m) {
        		for(; j<n; j++) {
        			nums3[count] = nums2[j];
        			count++;
        		}
        	}else if(j == n) {
        		for(; i<m; i++) {
        			nums3[count] = nums1[i];
        			count++;
        		}
        	}else {
        		if(nums1[i] < nums2[j]) {
        			nums3[count] = nums1[i];
        			i++;
        			count++;
        		}else {
        			nums3[count] = nums2[j];
        			j++;
        			count++;
        		}
        	}
        }
        	
		return (m+n)%2 == 1? (double)nums3[medianIndex] : ((double)nums3[medianIndex] + (double)nums3[medianIndex-1])/2;
    }
}
