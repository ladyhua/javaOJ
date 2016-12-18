package com.leetcode.code;

public class Main289 {
	public static void main(String args[]) {
		int[][] board = {{0,1}};
		gameOfLife(board);
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void gameOfLife(int[][] board) {
		if(board == null || board.length == 0 || board[0].length == 0) return;
		int res[][] = new int[board.length][board[0].length];
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				int count = 0;
				if(i>=1 && j>=1 && board[i-1][j-1] == 1) count++;
				if(i>=1 && board[i-1][j] == 1) count++;
				if(i>=1 && j<board[0].length-1 && board[i-1][j+1] == 1) count++;
				if(j>=1 && board[i][j-1] == 1) count++;
				if(j<board[0].length-1 && board[i][j+1] == 1) count++;
				if(i<board.length-1 && j>=1 && board[i+1][j-1] == 1) count++;
				if(i<board.length-1 && board[i+1][j] == 1) count++;
				if(i<board.length-1 && j<board[0].length-1 && board[i+1][j+1] == 1) count++;
				if(board[i][j] == 0) {
					if(count == 3) 
						res[i][j] = 1;
					else res[i][j] = 0;
				} else {
					if(count < 2 || count > 3)
						res[i][j] = 0;
					else 
						res[i][j] = 1;
				}
			}
		}
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				board[i][j] = res[i][j];
			}
		}
	}
	/** 
	 * @Description  边界环绕解法
	 * @author hlz
	 * @param board  
	 */
	  	
	public static void gameOfLife1(int[][] board) {
		if(board == null || board.length == 0 || board[0].length == 0) return;
		int res[][] = new int[board.length][board[0].length];
		int row = board.length;
		int column = board[0].length;
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				int count = 0;
				if(board[(i-1+row)%row][(j-1+column)%column] == 1) count++;
				if(board[(i-1+row)%row][j] == 1) count++;
				if(board[(i-1+row)%row][(j+1)%column] == 1) count++;
				if(board[i][(j-1+column)%column] == 1) count++;
				if(board[i][(j+1)%column] == 1) count++;
				if(board[(i+1)%row][(j-1+column)%column] == 1) count++;
				if(board[(i+1)%row][j] == 1) count++;
				if(board[(i+1)%row][(j+1)%column] == 1) count++;
				if(board[i][j] == 0) {
					if(count == 3) 
						res[i][j] = 1;
					else res[i][j] = 0;
				} else {
					if(count < 2 || count > 3)
						res[i][j] = 0;
					else 
						res[i][j] = 1;
				}
			}
		}
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				board[i][j] = res[i][j];
			}
		}
	}
}
