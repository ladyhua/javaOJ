package com.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class Main166 {
	public static void main(String args[]) {
		int numerator = 1;
		int denominator = 7;
		System.out.println(fractionToDecimal(numerator,denominator));
	}
	public static String fractionToDecimal(int numerator,int denominator) {
		String res = "";
		if(numerator > 0 && denominator < 0 || numerator < 0 && denominator > 0) 
			res += "-";
		long num = numerator,den = denominator;
		long l1 = Math.abs(num);
		long l2 = Math.abs(den);
		long res1 = l1/l2;
		res += res1;
		if(l1%l2 == 0) {
			return res;
		}
		res += ".";
		long rem = l1%l2;
		Map<Long, Integer> map = new HashMap<Long,Integer>();
		while(rem != 0) {
			rem = rem * 10;
			if(map.containsKey(rem)) {
				int index = map.get(rem);
				String part1 = res.substring(0, index);
				String part2 = res.substring(index);
				res = part1 + "(" + part2 + ")";
				return res;
			} else {
				map.put(rem, res.length());
				res += rem / l2;
				rem = rem % l2;
			}
		}
		return res;
	}
}
