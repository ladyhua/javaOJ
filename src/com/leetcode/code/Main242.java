package com.leetcode.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main242 {
	public static void main(String args[]) {
		String s = "a";
		String t = "b";
		System.out.println(isAnagram(s,t));
	}
	public static boolean isAnagram(String s,String t) {
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return String.valueOf(c1).equals(String.valueOf(c2));
	}
	/** 
	 * @Description 拙略的算法
	 * @author hlz
	 * @param s
	 * @param t
	 * @return  
	 */
	  	
	public static boolean isAnagram1(String s,String t) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for(char c : t.toCharArray()) {
			if(map.containsKey(c)) {
				int i = map.get(c);
				if(i <= 0) return false;
				map.put(c, --i);
			} else {
				return false;
			}
		}
		for(int i : map.values()) {
			if(i != 0) {
				return false;
			}
		}
		return true;
	}
}
