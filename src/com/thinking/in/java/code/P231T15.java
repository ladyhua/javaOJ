package com.thinking.in.java.code;

public class P231T15 {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		char[] chars = s.toCharArray();
		for(int i=0; i<chars.length; i++) {
			if(chars[i] == '+') {
				i++;
				stack.push(chars[i]);
			} else if(chars[i] == '-'){
				System.out.print(stack.pop());
			}
		}
	}
}
