package com.leetcode.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main30 {
	public static void main(String args[]) {
		String s = "wordgoodgoodgoodbestword";
		String[] words = {"word","good","best","good"};
		System.out.print(findSubstring(s,words));
	}
	public static List<Integer> findSubstring(String s,String[] words) {
		List<Integer> res = new ArrayList<Integer>();
		if(words == null || words.length == 0 || s == null) return res;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String word : words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		for(int i=0; i<words[0].length(); i++) {
			HashMap<String,Integer> curMap = new HashMap<String,Integer>();
			int count = 0;
			int left = i;
			for(int j=left;j<=s.length()-words[0].length(); j += words[0].length()) {
				String str = s.substring(j,j+words[0].length());
				if(map.containsKey(str)) {
					if(curMap.containsKey(str))
						curMap.put(str, curMap.get(str) + 1);
					else
						curMap.put(str,1);
					if(curMap.get(str) <= map.get(str)) {
						count++;
					} else {
						while(curMap.get(str) > map.get(str)) {
							String temp = s.substring(left,left+words[0].length());
							curMap.put(temp, curMap.get(temp)-1);
							if(curMap.get(temp) < map.get(temp)) {
								count--;
							}
							left += words[0].length();
						}
					}
					if(count == words.length) {
						res.add(left);
						String temp = s.substring(left,left+words[0].length());
						curMap.put(temp, curMap.get(temp)-1);
						count--;
						left += words[0].length();
					}
				} else {
					curMap.clear();
					count = 0;
					left = j + words[0].length();
				}
			}
		}
		return res;
	}
	
	/** 
	 * @Description 拙略的算法 
	 * @author hlz
	 * @param s
	 * @param words
	 * @return  
	 */
	  	
	public static List<Integer> findSubstring1(String s,String[] words) {
		List<Integer> res = new ArrayList<Integer>();
		if(words == null || words.length == 0 || s == null) return res;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
 		for(String word : words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		for(int i=0; i<s.length(); i++) {
			HashMap<String,Integer> curMap = (HashMap<String,Integer>)map.clone();
			int j;
			if((s.length()-i) < words.length * words[0].length()) break;
			int left = i, right = i + words[0].length();
			if(right > s.length()) continue;
			for(j=0; j<words.length; j++) {
				String temp = s.substring(left, right);
				if(!curMap.containsKey(temp) || curMap.get(temp) == 0) break;
				curMap.put(temp, curMap.get(temp) - 1);
				left += words[0].length();
				right += words[0].length();
				if(right > s.length()) break;
			}
			boolean flag = true;
			for(String word : curMap.keySet()) {
				if(curMap.get(word) != 0) flag = false;
			}
			if(flag) res.add(i);
			
		}
		return res;
	}
}
