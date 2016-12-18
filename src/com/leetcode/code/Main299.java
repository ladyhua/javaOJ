package com.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class Main299 {
	public static void main(String args[]) {
		String secret = "1807";
		String guess = "7810";
		System.out.println(getHint(secret,guess));
	}
	public static String getHint(String secret,String guess) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int bull = 0;
		int cowsAndBull = 0;
		for(int i=0; i<secret.length(); i++) {
			if(secret.charAt(i) == guess.charAt(i)) {
				bull++;
			}
			if(map.containsKey(secret.charAt(i))) {
				map.put(secret.charAt(i), map.get(secret.charAt(i)) + 1);
			} else {
				map.put(secret.charAt(i), 1);
			}
		}
		for(int i=0; i<guess.length(); i++) {
			if(map.containsKey(guess.charAt(i))) {
				if(map.get(guess.charAt(i)) > 0 ) {
					cowsAndBull++;
					map.put(guess.charAt(i), map.get(guess.charAt(i) ) - 1);
				}
			}
		}
		String res = bull + "A" + (cowsAndBull-bull) + "B";
		return res;
	}
}
