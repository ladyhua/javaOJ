package com.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class Main290 {
	public static void main(String args[]) {
		String pattern = "abba";
		String str = "dog dog dog dog";
		System.out.println(wordPattern(pattern,str));
	}
	public static boolean wordPattern(String pattern,String str) {
		Map<Character,String> map = new HashMap<Character,String>();
		String[] strs = str.split(" ");
		if(pattern.length() != strs.length) return false;
		for(int i=0; i<pattern.length(); i++) {
			if(map.containsKey(pattern.charAt(i))) {
				if(!strs[i].equals(map.get(pattern.charAt(i)))) return false;
			} else {
				map.put(pattern.charAt(i), strs[i]);
			}
		}
		Map<String,Character> map1 = new HashMap<String,Character>();
		for(int i=0; i<strs.length; i++) {
			if(map1.containsKey(strs[i])) {
				if(pattern.charAt(i) != map1.get(strs[i])) return false;
			} else {
				map1.put(strs[i] , pattern.charAt(i));
			}
		}
		return true;
	}
}
