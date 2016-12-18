package com.leetcode.code;

public class Main63 {
	public static void main(String args[]) {
		int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int[][] res = new int[obstacleGrid.length][obstacleGrid[0].length];
		if(obstacleGrid == null || obstacleGrid.length < 1 || obstacleGrid[0].length < 1) {
			return 0;
		}
		int i;
		for(i=obstacleGrid.length-1;i>=0; i--) {
			if(obstacleGrid[i][obstacleGrid[0].length-1] == 0) {
				res[i][obstacleGrid[0].length-1] = 1;
		
			} else {
				res[i][obstacleGrid[0].length-1] = 0;
				break;
			}
		}
		if(i > 0) {
			for(int j=i-1;j>=0;j--) {
				res[j][obstacleGrid[0].length-1] = 0;
			}
		}
		for(i=obstacleGrid[0].length-1;i>=0;i--) {
			if(obstacleGrid[obstacleGrid.length-1][i] == 0) {
				res[obstacleGrid.length-1][i] = 1;
			} else {
				res[obstacleGrid.length-1][i] = 0;
				break;
			}
		}
		if(i>0) {
			for(int j=i-1;j>=0;j--) {
				res[obstacleGrid.length-1][j] = 0;
			}
		}
		for(i=obstacleGrid.length-2; i>=0; i--) {
			for(int j=obstacleGrid[0].length-2; j>=0; j--) {
				if(obstacleGrid[i][j] == 1) {
					res[i][j] = 0;
				} else {
					res[i][j] = res[i+1][j] + res[i][j+1];
				}
			}
		}
		return res[0][0];
	}
}
