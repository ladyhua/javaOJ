package com.leetcode.code;
//花了两个小时，超时

import java.util.HashSet;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		String s = "vivf";
		int length = lengthOfLongestSubstring(s);
		System.out.println(length);
	}
	/** 
	 * @Description 拙略的算法 
	 * @author hlz
	 * @param s
	 * @return  
	 */
	  	
	public static int lengthOfLongestSubstring(String s) {
		 Set<Character> l = new HashSet<Character>();
		 if(s.length() == 0 ) {
			 return 0;
		 }
		 int max = 1;
		 int length = 1;
		 int j;
		 for(int i=0; i<s.length()-1; i++) {
			 l.clear();
			 l.add(s.charAt(i));
			 length = 1;
			 for(j=i+1;j<s.length();j++) {
				 if(!l.contains(s.charAt(j))) {
					 l.add(s.charAt(j));
					 length++;
				 } else {
					 max = Math.max(max, length);
					 break;
				 }
			 }
			 max = Math.max(max, length);
			 if(j == s.length()) break;
		 }
		 return max;
	}
}
			