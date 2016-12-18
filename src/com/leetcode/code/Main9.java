package com.leetcode.code;

public class Main9 {
	public static void main(String args[]) {
		System.out.println(isPalindrome(1));
	}
	public static boolean isPalindrome(int x) {
        char[] c = (x + "").toCharArray();
        if(c.length == 0 || c.length == 1) {
        	return true;
        }
        int front,back;
        if(c.length % 2 == 0) {
        	front = c.length/2 - 1;
        	back = c.length/2;
        } else {
        	front = c.length/2 -1;
        	back = c.length/2 +1;
        }
        while(front > -1) {
        	if(c[front] != c[back]) {
        		return false;
        	}
        	front --;
        	back ++;
        }
		return true;
    }
}
