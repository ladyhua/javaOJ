package com.leetcode.code;
//AC
public class Main7 {
	public static void main(String[] args) {
		int i = 100000003;
		System.out.println(reverse(i));
	}
	public static int reverse(int x) {
		long result = 0;
		while(x != 0) {
			result = result*10 + x%10;
			if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
				return 0;
			}
			x = x/10;
		}
		
        return (int)result;
    }
}
