package com.leetcode.code;

import java.util.ArrayList;
import java.util.List;

public class Main120 {
	public static void main(String args[]) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> list0 = new ArrayList<Integer>();
		list0.add(2);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);list1.add(4);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(6);list2.add(5);list2.add(7);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(4);list3.add(1);list3.add(8);list3.add(3);
		triangle.add(list0);triangle.add(list1);triangle.add(list2);triangle.add(list3);
		System.out.println(minimumTotal(triangle));
	}
	public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0) {
        	return 0;
        }
        int min = Integer.MAX_VALUE;
        int[] res = new int[(triangle.size() * (1 + triangle.size())) / 2];
        res[0] = triangle.get(0).get(0);
        int count = 0;
        for(int i=1; i<triangle.size();i++) {
        	List<Integer> list = triangle.get(i);
        	for(int j=0; j<list.size(); j++) {
        		count++;
        		if(j == 0) {
        			res[count] = res[count - i] + list.get(j);
        		}else if(j == list.size() - 1) {
        			res[count] = res[count - i -1] + list.get(j);
        		} else {
        			res[count] = Math.min(res[count-i], res[count-i-1]) + list.get(j);
        		}
        	}
        }
        int lastRowNum = triangle.size() - 1;
        int lastRowFirstNum = ((lastRowNum * (lastRowNum + 1)) / 2);
        for(int i=lastRowFirstNum; i<res.length; i++) {
        	if(res[i] < min) min = res[i];
        }
        return min;
    }
}
