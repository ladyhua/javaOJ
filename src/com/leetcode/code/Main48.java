package com.leetcode.code;

public class Main48 {
	public static void main(String args[]) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
	}
	public static void rotate(int[][] matrix) {
		if(matrix == null || matrix.length == 0) {
			return;
		}
		for(int i=0; i<matrix.length/2; i++) {
			for(int j=0; j<(matrix.length+1)/2; j++) {
				int a1 = i, b1 = j;
				int a2 = b1, b2 = matrix.length - a1 - 1;
				int a3 = b2, b3 = matrix.length - a2 - 1;
				int a4 = b3, b4 = matrix.length - a3 - 1;
				int temp1 = matrix[a1][b1],temp2 = matrix[a2][b2],temp3 = matrix[a3][b3],temp4 = matrix[a4][b4];
				matrix[a2][b2] = temp1;
				matrix[a3][b3] = temp2;
				matrix[a4][b4] = temp3;
				matrix[a1][b1] = temp4;	
			}
		}
		//输出
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
