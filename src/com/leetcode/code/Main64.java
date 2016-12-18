package com.leetcode.code;

public class Main64 {
	public static void main(String args[]) {
		int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(minPathSum(grid));
	}
	public static int minPathSum(int[][] grid) {
		if(grid == null ) {
			return -1;
		}
		if(grid.length < 1 || grid[0].length < 1) {
			return -1;
		}
		int[][] res = new int[grid.length][grid[0].length];
		res[grid.length-1][grid[0].length-1] = grid[grid.length-1][grid[0].length-1];
		for(int i=grid.length-2; i>=0; i--) {
			res[i][grid[0].length-1] = grid[i][grid[0].length-1] + res[i+1][grid[0].length-1];
		}
		for(int i=grid[0].length-2; i>=0; i--) {
			res[grid.length-1][i] = grid[grid.length-1][i] + res[grid.length-1][i+1];
		}
		for(int i=grid.length-2; i>=0; i--) {
			for(int j=grid[0].length-2; j>=0; j--) {
				res[i][j] = Math.min(res[i+1][j], res[i][j+1]) + grid[i][j];
			}
		}
		return res[0][0];
	}
}
