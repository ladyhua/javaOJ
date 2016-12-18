package com.thinking.in.java.code;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class P229T14 {
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		Integer[] integers = new Integer[]{1,2,3,4,5,6,7,8,9};
		for(Integer i : integers) {
			ListIterator<Integer> li = list.listIterator(list.size()/2);
			li.add(i);
			System.out.println(list);
		}
		System.out.println(list);
	}
}
