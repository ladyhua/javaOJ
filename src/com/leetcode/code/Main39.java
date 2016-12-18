package com.leetcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main39 {
	public static void main(String args[]) {
		int[] candidates = {2,3,6,7};
		System.out.println(combinationSum(candidates,7));
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates.length == 0) {
        	return res;
        }
        Arrays.sort(candidates);
        helper(candidates,0,target,new ArrayList<Integer>(),res);
        return res;
    }
	private static void helper(int[] candidates,int start,int target,List<Integer> item,List<List<Integer>> res ) {
		if(target < 0) {
			return;
		} 
		if(target == 0) {
			res.add(new ArrayList<Integer>(item));
			return;
		}
		for(int i= start; i<candidates.length; i++) {
			if(i>start && candidates[i] == candidates[i-1]) continue;
			item.add(candidates[i]);
			helper(candidates,i,target-candidates[i],item,res);
			item.remove(item.size() - 1);
		}
	}
}
