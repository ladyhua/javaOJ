package com.leetcode.code;

import java.util.HashSet;
import java.util.Set;

public class Main73 {
	public static void main(String args[]) {
		int[][] matrix = {{1,2,3},{4,0,6},{7,8,9}};
		setZeroes(matrix);
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void setZeroes(int[][] matrix) {
		if(matrix == null || matrix.length < 1 || matrix[0].length < 1) {
			return;
		}
		Set<Integer> row = new HashSet<Integer>();
		Set<Integer> column = new HashSet<Integer>();
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					if(!row.contains(i)) row.add(i);
					if(!column.contains(j)) column.add(j);
				}
			}
		}
		for(int i : row) {
			for(int j=0; j<matrix[0].length; j++) {
				matrix[i][j] = 0;
			}
		}
		for(int j : column) {
			for(int i=0; i<matrix.length; i++) {
				matrix[i][j] = 0;
			}
		}
	}
}
