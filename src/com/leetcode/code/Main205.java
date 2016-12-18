package com.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class Main205 {
	public static void main(String args[]) {
		String s = "foo";
		String t = "bar";
		System.out.println(isIsomorphic(s,t));
	}
	public static boolean isIsomorphic(String s,String t) {
		Map<Character,Character> map = new HashMap<Character,Character>();
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				if(map.get(s.charAt(i)) != t.charAt(i)) return false; 
			} else {
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		map.clear();
		for(int i=0; i<t.length(); i++) {
			if(map.containsKey(t.charAt(i))) {
				if(map.get(t.charAt(i)) != s.charAt(i)) return false; 
			} else {
				map.put(t.charAt(i), s.charAt(i));
			}
		}
		return true;
	}
}
