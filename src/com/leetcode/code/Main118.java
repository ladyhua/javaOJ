package com.leetcode.code;

import java.util.ArrayList;
import java.util.List;

public class Main118 {
	public static void main(String args[]) {
		System.out.println(generate(5)); 
	}
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(numRows == 0) return res;
		List<Integer> list0 = new ArrayList<Integer>();
		list0.add(1);
		res.add(list0);
		if(numRows == 1) return res;
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(1);
		res.add(list1);
		if(numRows == 2) return res;
		for(int i=2; i<numRows; i++) {
			List<Integer> list = new ArrayList<Integer>(res.get(i-1));
			List<Integer> newList = new ArrayList<Integer>();
			newList.add(1);
			for(int j=0; j<list.size()-1; j++) {
				newList.add(list.get(j) + list.get(j+1));
			}
			newList.add(1);
			res.add(newList);
		}
		return res;
	}
}
