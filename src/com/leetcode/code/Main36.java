package com.leetcode.code;

public class Main36 {
	public static void main(String args[]) {
		System.out.println((int)('6'-'1'));
	}
	public boolean isValidSudoku(char[][] board) {
		for(int i=0; i<9; i++) {
			boolean[] b = new boolean[9];
			for(int j=0; j<9; j++) {
				if(board[i][j] != '.') {
					if(b[(int)(board[i][j]-'1')]) {
						return false;
					}
					b[(int)(board[i][j]-'1')] = true;
				}
			}
		}
		for(int i=0; i<9; i++) {
			boolean[] b = new boolean[9];
			for(int j=0; j<9; j++) {
				if(board[j][i] != '.') {
					if(b[(int)(board[j][i]-'1')]) {
						return false;
					}
					b[(int)(board[j][i]-'1')] = true;
				}
			}
		}
		for(int k=0; k<9; k++) {
			int startRow = k/3 * 3;
			int startColumn = k%3 *3;
			boolean[] b = new boolean[9];
			for(int i=startRow; i<startRow+3; i++) {
				for(int j=startColumn; j<startColumn+3; j++) {
					if(board[i][j] != '.') {
						if(b[(int)(board[i][j]-'1')]) {
							return false;
						}
						b[(int)(board[i][j]-'1')] = true;
					}
				}
			}
		}
		return true;
    }
}
