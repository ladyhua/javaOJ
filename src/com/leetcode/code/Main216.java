package com.leetcode.code;

import java.util.ArrayList;
import java.util.List;

public class Main216 {
	public static void main(String args[]) {
		System.out.println(combinationSum3(3,6));
	}
	public static List<List<Integer>> combinationSum3(int k,int n) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		helper(res,new ArrayList<Integer>(),1,k,n);
		return res;
	}
	public static void helper(List<List<Integer>> res,List<Integer> nowList,int start,int num,int sum) {
		if(num == 0 && sum == 0) {
			res.add(new ArrayList<Integer>(nowList));
			return;
		}
		if(num < 0 || sum < 0) return;
		for(int i=start; i<10; i++) {
			nowList.add(i);
			helper(res,nowList,i+1,num-1,sum-i);
			nowList.remove(nowList.size()-1);
		}
	}
}
