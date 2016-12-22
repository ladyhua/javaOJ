package com.leetcode.code;

import java.util.ArrayList;
import java.util.List;

public class Main119 {
	public static void main(String args[]) {
		System.out.println(getRow(31));
		
	}
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<Integer>();
		if(rowIndex < 0) return res;
		for(int i=0; i<=rowIndex; i++) {
			res.add(computeC(i,rowIndex));
		}
		return res;
	}
	public static int computeC(int up,int down) {
		if(down < 1 || up == 0) return 1;
		if(up > down / 2) up = down - up;
		/*double fenZi = 1;
		double fenMu = 1;
		for(int i=0; i<up; i++) {
			fenZi *= (down - i);
			fenMu *= (i + 1);
		} 此方法会溢出
		return (int)(fenZi / fenMu);*/
		double result = 0.0;
		for(int i=down; i>=(down-up+1); i--) {
			result += Math.log(i); 
		}
		for(int i=up;i>0;i--) {
			result -= Math.log(i);
		}
		result = Math.exp(result);
		return (int)Math.round(result);
	}
}
