package com.effective.code;

public class Page170 {
	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4));
	}

	private static int sum(int...args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int arg:args) {
			sum += arg;
		}
		return sum;
	}
}
