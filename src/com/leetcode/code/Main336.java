package com.leetcode.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main336 {
	public static void main(String args[]) {
		String[] words = {"a",""};
		System.out.println(palindromePairs(words));
	}
	public static List<List<Integer>> palindromePairs(String[] words) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(words == null || words.length == 0) return res;
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0; i<words.length; i++) {
			map.put(words[i], i);
		}
		for(int i=0; i<words.length; i++) {
			if(words[i] == "" || words[i].length() == 0) {
				for(Map.Entry<String,Integer> entry : map.entrySet()) {
					if(isPalindrome(entry.getKey())) {
						addAll(res,i,entry.getValue());
					}
				}
			}
			
			for(int j=0; j<words[i].length(); j++) {
				String front = words[i].substring(0, j);
				String back = words[i].substring(j, words[i].length());
				String rfront = new StringBuilder(front).reverse().toString();
				String rback = new StringBuilder(back).reverse().toString();
				if(isPalindrome(front) && map.containsKey(rback)) {
					addAll(res,map.get(rback),i);
				}
				if(isPalindrome(back) && map.containsKey(rfront)) {
					addAll(res,i,map.get(rfront));
				}
			}
		}
		return res;
	}
	public static void addAll(List<List<Integer>> res,int a,int b) {
		if(a == b) return;
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		res.add(list);
	}
	public static boolean isPalindrome(String s) {
		for(int i=0,j=s.length()-1; i<j; i++,j--) {
			if(s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}
	/** 
	 * @Description 拙略的算法
	 * @author hlz
	 * @param words
	 * @return  
	 */
	  	
	public static List<List<Integer>> palindromePairs1(String[] words) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(words == null || words.length == 0) return res;
		for(int i=0; i<words.length-1; i++) {
			for(int j=i+1; j<words.length; j++) {
				String s = words[i] + words[j];
				if(isPalindromePairs(s)) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(i);
					list.add(j);
					res.add(list);
				}
				s = words[j] + words[i];
				if(isPalindromePairs(s)) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(j);
					list.add(i);
					res.add(list);
				}
			}
		}
		return res;
	}
	public static boolean isPalindromePairs(String s) {
		if(s == null || s.length() == 0) return false;
		if(s.length() == 1) return true;
		int front,back;
		if(s.length() % 2 == 0) {
			front = s.length()/2 - 1;
			back = s.length()/2;
		} else {
			front = s.length()/2 - 1;
			back = s.length()/2 + 1;
		}
		while(front >= 0 && back < s.length()) {
			if(s.charAt(front) != s.charAt(back)) {
				return false;
			} else {
				front--;
				back++;
			}
		}
		return true;
	}
}
