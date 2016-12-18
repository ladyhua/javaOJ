package com.leetcode.code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main149 {
	public static void main(String args[]) {
		Point[] points = {new Point(2,3),new Point(3,3),new Point(-5,3)};
		System.out.println(maxPoints(points));
	}
	public static int maxPoints(Point[] points) {
		if(points == null || points.length == 0) return 0;
		if(points.length == 1) return 1;
		int res = -1;
		for(int i=0; i<points.length-1; i++) {
			int repeat = 0;
			Map<Double,Integer> map = new HashMap<Double,Integer>();
			for(int j=i+1; j<points.length; j++) {
				double k;
				if(points[i].x == points[j].x && points[i].y == points[j].y) {
					repeat++;
					continue;
				}
				if(points[i].x == points[j].x) k = Double.MAX_VALUE;
				else if(points[i].y == points[j].y) k = 0;
				else k = (double)(points[j].y - points[i].y) / (double)(points[j].x - points[i].x);
				if(map.containsKey(k)) {
					map.put(k, map.get(k)+1);
				} else {
					map.put(k, 2);
				}
			}
			if(map.size() == 0) {
				res = points.length;
			}
			Iterator<Integer> it = map.values().iterator();
			while(it.hasNext()) {
				int count = it.next();
				res = Math.max(count+repeat, res);
			}
		}
		return res;
	}
}
