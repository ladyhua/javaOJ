package com.leetcode.code;

public class Main79 {
	public static void main(String args[]) {
		char[][] board = {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
		String word = "abcced";
		System.out.println(exist(board,word));
	}
	
	public static boolean exist(char[][] board,String word) {
		if(board == null || board.length < 1 || board[0].length < 1) {
			return false;
		}
		char[] words = word.toCharArray();
		if(words.length < 1) {
			return true;
		}
		boolean[][] isUsed = new boolean[board.length][board[0].length];
		resetBoolean(isUsed);
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j] == words[0]){
					isUsed[i][j] = true;
					if(word.length() == 1) 
						return true;
					boolean b = find(board,words,isUsed,i,j,1);
					if(b) {
						return true;
					}
					resetBoolean(isUsed);	
				}
				
			}
		}
		return false;
	}
	public static boolean find(char[][] board,char[] words,boolean[][] isUsed,int row,int column,int wordStart) {
		boolean b = false;
		if(wordStart == words.length) {
			return true;
		}
		if(row > 0 && board[row-1][column] == words[wordStart] && !isUsed[row-1][column]) {
			row--;
			isUsed[row][column] = true;
			b = find(board,words,isUsed,row,column,wordStart+1);
			if(b) return true;
			isUsed[row][column] = false;
			row++;
		}
		if(row < board.length - 1 && board[row+1][column] == words[wordStart] && !isUsed[row+1][column]) {
			row++;
			isUsed[row][column] = true;
			b = find(board,words,isUsed,row,column,wordStart+1);
			if(b) return true;
			isUsed[row][column] = false;
			row--;
			
		}
		if(column > 0 && board[row][column-1] == words[wordStart] && !isUsed[row][column-1]) {
			column--;
			isUsed[row][column] = true;
			b = find(board,words,isUsed,row,column,wordStart+1);
			if(b) return true;
			isUsed[row][column] = false;
			column++;
		}
		if(column < board[0].length - 1 && board[row][column+1] == words[wordStart] && !isUsed[row][column+1]) {
			column++;
			isUsed[row][column] = true;
			b = find(board,words,isUsed,row,column,wordStart+1);
			if(b) return true;
			isUsed[row][column] = false;
			column--;
		}
		return false;
	}
	public static void resetBoolean(boolean[][] isUsed) {
		for(int i=0; i<isUsed.length; i++) {
			for(int j=0;j<isUsed[0].length; j++) {
				isUsed[i][j] = false;
			}
		}
	}
	/** 
	 * @Description 理解错了
	 * @author hlz
	 * @param board
	 * @param word
	 * @return  
	 */
	  	
	public static boolean exist1(char[][] board,String word) {
		if(board == null || board.length<1 || board[0].length<1)
			return false;
		char[] words = word.toCharArray();
		boolean[] isAccept = new boolean[words.length];
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				for(int k=0; k<words.length; k++) {
					if(words[k] == board[i][j] && !isAccept[k]) {
						isAccept[k] = true;
						break;
					}
				}
			}
		}
		for(int i=0; i<isAccept.length;i++) {
			if(!isAccept[i]) {
				return false;
			}
		}
		return true;
	}
}
