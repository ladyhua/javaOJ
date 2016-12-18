package com.leetcode.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main187 {
	public static void main(String args[]) {
		String s = "AAAAACCCCCAAAAACCCCCAAAAAGGGTTT";
		System.out.println(findRepeatedDnaSequences(s));
	}
	public static List<String> findRepeatedDnaSequences(String s) {
		List<String> res = new ArrayList<String>();
		if(s == null || s.length() == 0) return res;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<=s.length()-10; i++) {
			String str = s.substring(i,i+10);
			int key = hash(str);
			if(set.contains(key) && !res.contains(str)) {
				res.add(str);
			} else {
				set.add(key);
			}
		}
		return res;
	}
	/** 
	 * @Description通过但效率太低 
	 * @author hlz
	 * @param s
	 * @return  
	 */
	  	
	public static List<String> findRepeatedDnaSequences1(String s) {
		List<String> res = new ArrayList<String>();
		if(s == null || s.length() == 0) return res;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<=s.length()-10; i++) {
			String str = s.substring(i,i+10);
			int key = hash(str);
			if(map.containsKey(key)) {
				if(map.get(key) == 1) {
					res.add(str);
					map.put(key, map.get(key) + 1);
				}
			} else {
				map.put(key, 1);
			}
		}
		return res;
	}
	public static int hash(String str) {
		int hash = 0;
		for(int i=0; i<str.length(); i++) {
			hash = hash << 2 | reInt(str.charAt(i));
		}
		return hash;
	}
	public static int reInt(char c) {
		switch(c) {
		case 'A': return 0;
		case 'C': return 1;
		case 'G': return 2;
		case 'T': return 3;
		default: return 0;
		}
	}
}
