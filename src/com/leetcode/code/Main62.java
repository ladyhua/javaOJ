package com.leetcode.code;

public class Main62 {
	public static void main(String args[]) {
		System.out.println(uniquePaths(2,2));
	}
	
	public static int uniquePaths(int m,int n) {
		int[][] res = new int[m][n];
		if(m < 1 || n <1) {
			return 0;
		}
		for(int i=0; i<m; i++) {
			res[i][n-1] = 1;
		}
		for(int i=0; i<n; i++) {
			res[m-1][i] = 1;
		}
		for(int i=m-2; i>=0; i--) {
			for(int j=n-2; j>=0; j--) {
				res[i][j] = res[i+1][j] + res[i][j+1];
			}
		}
		return res[0][0];
	}
	
	/** 
	 * @Description 
	 * @author hlz
	 * @param m
	 * @param n
	 * @return  
	 */
	  	
	public static int uniquePaths1(int m,int n) {
		return compute(1,1,m,n);
	}
	public static int compute(int i,int j,int m,int n) {
		if(i > m || j > n) {
			return 0;
		}
		if(i == m || j == n) {
			return 1;
		}
		return compute(i+1,j,m,n) + compute(i,j+1,m,n);
	}
}
