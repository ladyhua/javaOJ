package com.leetcode.code;

import java.util.Arrays;

public class Main274 {
	public static void main(String args[]) {
		int[] citations = {3,0,6,1,5};
		System.out.println(hIndex(citations));
	}
	public static int hIndex(int[] citations) {
		if(citations == null || citations.length == 0) return 0;
		int res = 0;
		int count = 1;
		Arrays.sort(citations);
		for(int i=citations.length-1; i>=0; i--) {
			if(citations[i] >= count) {
				res = count;
				count++;
			} else {
				break;
			}
		}
		return res;
	}
}
