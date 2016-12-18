package com.thinking.in.java.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class SortTest implements Comparable<SortTest> {
	private int id;
	public SortTest(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	@Override
	public int compareTo(SortTest st) {
		return (this.id-st.id);
	}
	@Override
	public String toString() {
		return "st" + id;
	}
}
class SortTestComparator implements Comparator<SortTest> {
	public int compare(SortTest st1,SortTest st2) {
		return st1.getId() - st2.getId();
	}
}
public class P454T21 {
	public static void main(String args[]) {
		Random rand = new Random(47);
		SortTest[] st = new SortTest[10];
		for(int i=0; i<10; i++) {
			st[i] = new SortTest(rand.nextInt(100));
		}
		System.out.println("Before sort:" + Arrays.toString(st));
		/*Arrays.sort(st,Collections.reverseOrder());*/
		Arrays.sort(st,new SortTestComparator());
		System.out.println("After sort:" + Arrays.toString(st));
	}
}
