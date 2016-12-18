package com.leetcode.code;
//AC
import java.util.HashMap;
import java.util.Map;

public class Main5 {
	public static void main(String[] args) {
		String s = "aa";
		System.out.println(longestPalindrome(s));
	}

	private static String longestPalindrome(String s) {
		char[] c = s.toCharArray();
		Map<Integer,String> map = new HashMap<Integer,String>();
		int j,length,max=0;
		String c1,c2;
		if(c.length == 1) return c[0]+"";
		for(int i=0;i<c.length;i++) {
			for(j=1;(i-j)>=0&&(i+j)<c.length;j++) {
				if(c[i-j] != c[i+j]) {
					break;
				}
			}
			j--;
			
			c1 = s.substring(i-j, i+j+1);
			length = 2*j+1;
			map.put(length, c1);
			if(length >max) max = length;
			
			for(j=0;(i-j)>=0&&(i+j+1)<c.length;j++) {
				if(c[i-j] != c[i+j+1]) break;
			}
			if(j>0) {
				j--;
				c2 = s.substring(i-j,i+j+1+1);
				length = 2*j+2;
				map.put(length, c2);
				if(length > max) max = length;
			}
			
		}
		String str = map.get(max);
		return str;
	}
}
