package com.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class Main389 {
	public static void main(String args[]) {
		String s = "abcd";
		String t = "abecd";
		System.out.println(findTheDifference(s,t));
	}
	public static char findTheDifference(String s,String t) {
		int res = 0;
		for(int i=0; i<s.length(); i++) {
			res ^= s.charAt(i);
		}
		for(int i=0; i<t.length(); i++) {
			res ^= t.charAt(i);
		}
		return (char)res;
	}
	/** 
	 * @Description 拙略的算法
	 * @author hlz
	 * @param s
	 * @param t
	 * @return  
	 */
	  	
	public static char findTheDifference1(String s,String t) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for(int i=0; i<t.length(); i++) {
			if(map.containsKey(t.charAt(i))) {
				if(map.get(t.charAt(i)) == 0) {
					return t.charAt(i);
				} else {
					map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
				}
			} else {
				return t.charAt(i);
			}
		}
		return 'a';
	}
}
