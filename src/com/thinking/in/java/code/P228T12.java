package com.thinking.in.java.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class P228T12 {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>(10);
		for(int i=0; i<10; i++)
			list.add(i);
		List<Integer> sList = Arrays.asList(new Integer[10]);
		ListIterator<Integer> li = list.listIterator(10);
		int i = 0;
		while(li.hasPrevious()) {
			Integer in = li.previous();
			sList.set(i, in);
			i++;
		}
		System.out.println(list);
		System.out.println(sList);
	}
}
