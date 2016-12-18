package com.leetcode.code;
//二分法条件i<=j，才能保证如果找到已经返回，没找到一定是j = i -1；要找的数在j和i之间

public class Main74 {
	public static void main(String args[]) {
		int[][] matrix = {{1,2,3},{4,5,6}};
		System.out.println(searchMatrix(matrix,7));
	}
	public static boolean searchMatrix(int[][] matrix,int target) {
		if(matrix == null || matrix.length < 1 || matrix[0].length < 1) {
			return false;
		}
		int i = 0,j = matrix.length-1;
		int mid = (i + j) / 2;
		while(i <= j) {
			if(matrix[mid][0] > target) {
				j = mid - 1;
				mid = (i + j) / 2;
			} else if(matrix[mid][0] < target) {
				i = mid + 1;
				mid = (i + j) / 2;
			} else {
				return true;
			}
		}
		int find = j;
		if(find < 0) return false;
		i = 0;
		j = matrix[0].length - 1;
		mid = (i + j) / 2;
		while(i <= j) {
			if(matrix[find][mid] > target) {
				j = mid - 1;
				mid = (i + j) / 2;
			} else if(matrix[find][mid] < target) {
				i = mid + 1;
				mid = (i + j) / 2;
			} else {
				return true;
			}
		}
		return false;
	}
}
