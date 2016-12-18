package com.leetcode.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main56 {
	public static void main(String args[]) {
		List<Interval> intervals = new ArrayList<Interval>();
		Interval inte1 = new Interval(2,3);
		Interval inte2 = new Interval(4,5);
		Interval inte3 = new Interval(6,7);
		Interval inte4 = new Interval(1,10);
		intervals.add(inte1);
		intervals.add(inte2);
		intervals.add(inte3);
		intervals.add(inte4);
		System.out.println(merge(intervals));
	}
	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<Interval>();
		if(intervals == null || intervals.size() == 0) {
			return res;
		}
		Comparator<Interval> comp = new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				if(o1.start == o2.start) return o1.end - o2.end;
				return o1.start - o2.start;
			}
			
		};
		Collections.sort(intervals, comp);
		Interval inte = intervals.remove(0);
		res.add(inte);
		for(Interval inteTemp : intervals) {
			if(inteTemp.start > res.get(res.size()-1).end) {
				res.add(inteTemp);
			} else {
				res.get(res.size()-1).end = Math.max(res.get(res.size()-1).end, inteTemp.end);
			}
		}
		return res;
	}
}
