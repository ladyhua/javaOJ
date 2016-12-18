package com.leetcode.code;

import java.util.ArrayList;
import java.util.List;

public class Main54 {
	public static void main(String args[]) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(matrix));
	}
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return list;
		int min = Math.min(matrix.length, matrix[0].length);
		int num = min/2;
		for(int i=0; i<num; i++) {
			for(int j=i; j<matrix[0].length-i-1; j++) {
				list.add(matrix[i][j]);
			}
			for(int j=i;j<matrix.length-i-1;j++) {
				list.add(matrix[j][matrix[0].length-i-1]);
			}
			for(int j=i;j<matrix[0].length-i-1;j++) {
				list.add(matrix[matrix.length-i-1][matrix[0].length-j-1]);
			}
			for(int j=i; j<matrix.length-i-1;j++) {
				list.add(matrix[matrix.length-j-1][i]);
			}
		}
		if(min % 2 ==1) {
			if(matrix.length > matrix[0].length) {
				for(int i=num; i<matrix.length-num; i++) {
					list.add(matrix[i][matrix[0].length/2]);
				}
			} else if(matrix.length < matrix[0].length) {
				for(int i=num; i<matrix[0].length-num;i++) {
					list.add(matrix[matrix.length/2][i]);
				}
			} else {
				list.add(matrix[matrix.length/2][matrix.length/2]);
			}
		}
		return list;
	}
}
