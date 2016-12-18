package com.leetcode.code;

public class Main59 {
	public static void main(String args[]) {
		int n = 4;
		int[][] res = generateMatrix(n);
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(res[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int layerNum = n / 2;
        int count = 1;
        for(int layer=0; layer<layerNum; layer++) {
        	for(int i=layer; i<n-1-layer; i++) {
        		res[layer][i] = count;
        		count++;
        	}
        	for(int i=layer; i<n-1-layer; i++) {
        		res[i][n-1-layer] = count;
        		count++;
        	}
        	for(int i=layer; i<n-1-layer; i++) {
        		res[n-1-layer][n-1-i] = count;
        		count++;
        	}
        	for(int i=layer; i<n-1-layer; i++) {
        		res[n-1-i][layer] = count;
        		count++;
        	}
        }
        if(n % 2 == 1) {
        	res[n/2][n/2] = count;
        }
        return res;
    }
}
