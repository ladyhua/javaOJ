package com.leetcode.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main57 {
	public static void main(String args[]) {
		List<Interval> intervals = new ArrayList<Interval>();
		Interval inte1 = new Interval(1,2);
		Interval inte2 = new Interval(3,5);
		Interval inte3 = new Interval(6,7);
		Interval inte4 = new Interval(8,10);
		Interval newInterval = new Interval(4,9);
		intervals.add(inte1);
		intervals.add(inte2);
		intervals.add(inte3);
		intervals.add(inte4);
		System.out.println(insert(intervals,newInterval));
	}
	
	public static List<Interval> insert(List<Interval> intervals,Interval newInterval) {
		List<Interval> res = new ArrayList<Interval>();
		if((intervals == null || intervals.size() == 0) && newInterval == null)
			return res;
		if((intervals == null || intervals.size() == 0) && newInterval != null) {
			res.add(newInterval);
			return res;
		}
		int i;
		for(i=0; i<intervals.size();i++) {
			Interval inte = intervals.get(i);
			if(newInterval.start > inte.end){
				res.add(inte);
			} else {
				break;
			}
			
		}
		if(i == intervals.size()) {
			res.add(newInterval);
			return res;
		}
		int j;
		for(j=i; j<intervals.size(); j++) {
			Interval inte = intervals.get(j);
			if(newInterval.end < inte.start)
				break;
		}
		if(i == j){
			res.add(newInterval);
		} else {
			res.add(new Interval(Math.min(newInterval.start, intervals.get(i).start),Math.max(newInterval.end, intervals.get(j-1).end)));
		}
		for(i=j; i<intervals.size();i++) {
			Interval inte = intervals.get(i);
			res.add(inte);
		}
		return res;
	}
	/** 
	 * @Description 拙略的算法
	 * @author hlz
	 * @param intervals
	 * @param newInterval
	 * @return  
	 */
	  	
	public static List<Interval> insert1(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<Interval>();
        if(intervals == null || intervals.size() == 0) {
        	res.add(newInterval);
        	return res;
        }
        if(newInterval == null) {
        	return intervals;
        }
        intervals.add(newInterval);
        res = merge(intervals);
        return res;
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
