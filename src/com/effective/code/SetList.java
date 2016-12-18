package com.effective.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//167
public class SetList {
	public static void main(String[] args) {
		Set<Integer> sets = new HashSet<Integer>();
		List<Integer> lists = new ArrayList<Integer>();
		for(int i=-3;i<3;i++) {
			sets.add(i);
			lists.add(i);
		}
		
		for(int i=0;i<3;i++) {
			sets.remove(i);
			lists.remove(i);
		}
		System.out.println(sets + " " + lists);
	}
}
