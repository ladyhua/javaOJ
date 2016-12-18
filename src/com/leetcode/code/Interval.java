package com.leetcode.code;

/** 
 * @Description for leetcode 56 problem 
 * @author hlz
 * @date 2016年8月17日 下午4:21:07 
 * @version V1.0
 */ 
  	
public class Interval {
	int start;
	int end;
	Interval(){
		start = 0;
		end = 0;
	};
	Interval(int s,int e) {
		start = s;
		end = e;
	}
	@Override
	public String toString() {
		return "["+start+","+end+"]";
	}
}
