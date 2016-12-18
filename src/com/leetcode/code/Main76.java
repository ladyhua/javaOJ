package com.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class Main76 {
	public static void main(String args[]) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minWindow(s,t));
	}
	public static String minWindow(String s,String t) {
		if(s == null || s.length() == 0 || t == null || t.length() == 0) return "";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c : t.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		int left = 0, right = 0;
		int count = 0;
		String minWindow = "";
		int minSize = s.length() + 1;
		while(left <= right && right < s.length()) {
			if(map.containsKey(s.charAt(right))) {
				map.put(s.charAt(right), map.get(s.charAt(right))-1);
				if(map.get(s.charAt(right)) >= 0) {
					count++;
				}
			}
			while(count == t.length()) {
				if(right - left + 1 < minSize) {
					minSize = right -left + 1;
					minWindow = s.substring(left,right+1);
				}
				if(map.containsKey(s.charAt(left))) {
					map.put(s.charAt(left), map.get(s.charAt(left))+1);
					if(map.get(s.charAt(left)) > 0) {
						count--;
					}
				}
				left++;
			}
			right++;
		}
		if(minSize > s.length()) return "";
		return minWindow;
	}
}
