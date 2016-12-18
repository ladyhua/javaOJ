package com.leetcode.code;

public class Main37 {
	public void solveSudoku(char[][] board) {
		if(board == null || board.length != 9 || board[0].length != 9) return;
		helper(board,0,0);
	}
	public boolean helper(char[][] board,int i,int j) {
		if(j >= 9) {
			return helper(board,i+1,0);
		}
		if(i >=9 )
			return true;
		if(board[i][j] == '.') {
			for(int k=1; k<=9; k++) {
				board[i][j] = (char)(k + '0');
				if(check(board,i,j)) {
					if(helper(board,i,j+1))
						return true;
				}
				board[i][j] = '.';
			}
		} else {
			return helper(board,i,j+1);
		}
		return false;
	}
	private boolean check(char[][] board,int i,int j) {
		boolean[] b1 = new boolean[9];
		boolean[] b2 = new boolean[9];
		boolean[] b3 = new boolean[9];
 		for(int k=0; k<9; k++) {
			if(board[i][k] != '.') {
				if(b1[(int)(board[i][k]-'1')]) {
					return false;
				}
				b1[(int)(board[i][k]-'1')] = true;
			}
		}
		for(int k=0; k<9; k++) {
			if(board[k][j] != '.') {
				if(b2[(int)(board[k][j]-'1')]) {
					return false;
				}
				b2[(int)(board[k][j]-'1')] = true;
			}
		}
		int startRow = i/3*3;
		int startColumn = j/3*3;
		for(int k=startRow; k<startRow+3; k++) {
			for(int t=startColumn; t<startColumn+3; t++) {
				if(board[k][t] != '.') {
					if(b3[(int)(board[k][t]-'1')]) {
						return false;
					}
					b3[(int)(board[k][t]-'1')] = true;
				}
			}
		}
		return true;
	}
}
