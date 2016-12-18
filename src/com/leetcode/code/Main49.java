package com.leetcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main49 {
	public static void main(String args[]) {
		String[] strs = {"boo","bob"};
		System.out.println(groupAnagrams(strs));
	}
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<List<String>>();
		if(strs == null || strs.length == 0) return res;
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		for(String s : strs) {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String temp = new String(chars);
			if(map.containsKey(temp)) {
				List<String> list = map.get(temp);
				list.add(s);
				map.put(temp,list);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(s);
				map.put(temp, list);
			}
		}
		Iterator<List<String>> it = map.values().iterator();
		while(it.hasNext()) {
			List<String> list = it.next();
			res.add(list);
		}
		return res;
	}
	/** 
	 * @Description 拙略的算法
	 * @author hlz
	 * @param strs
	 * @return  
	 */
	  	
	public static List<List<String>> groupAnagrams1(String[] strs) {
		List<List<String>> res = new ArrayList<List<String>>();
		Map<Map<Character,Integer>,List<String>> map = new HashMap<Map<Character,Integer>,List<String>>();
		if(strs == null || strs.length == 0) return res;
		for(String s : strs) {
			Map<Character,Integer> curMap = new HashMap<Character,Integer>();
			for(int i=0; i<s.length(); i++) {
				if(curMap.containsKey(s.charAt(i))) {
					curMap.put(s.charAt(i), curMap.get(s.charAt(i))+1);
				} else {
					curMap.put(s.charAt(i), 1);
				}
			}
			if(map.containsKey(curMap)) {
				List<String> list = map.get(curMap);
				list.add(s);
				map.put(curMap,list );
			} else {
				List<String> list = new ArrayList<String>();
				list.add(s);
				map.put(curMap,list);
			}
		}
		for(Map<Character,Integer> curMap : map.keySet()) {
			List<String> list = map.get(curMap);
			res.add(list);
		}
		return res;
	}
}
