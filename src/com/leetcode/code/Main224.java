package com.leetcode.code;

import java.util.Stack;

public class Main224 {
	public static void main(String args[]) {
		String s = "1-(5)";
		System.out.println(calculate(s));
	}
	
	public static int calculate(String s) {
        int res = 0;
        Stack<Integer> stk = new Stack<Integer>();
        s = s.replaceAll(" ", "");
        stk.push(1);
        int sign = 1, i = 0;
        while(i < s.length()) {
        	char c = s.charAt(i);
        	if(c == '+') {
        		sign = 1;
        		i++;
        	} else if(c == '-') {
        		sign = -1;
        		i++;
        	} else if(c == '(') {
        		stk.push(stk.peek() * sign);
        		sign = 1;
        		i++;
        	} else if(c == ')') {
        		stk.pop();
        		i++;
        	} else {
        		int num = 0;
        		while(i < s.length() && Character.isDigit(s.charAt(i))) {
        			num = num * 10 + s.charAt(i) - '0';
        			i++;
        		}
        		res += num * sign * stk.peek();
        	}
        }
		return res;
    }
}
