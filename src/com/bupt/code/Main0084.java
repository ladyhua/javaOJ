package com.bupt.code;

import java.util.Scanner;

public class Main0084 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			int n = s.nextInt();
			long[] a=new long[n];
			for(int i=0; i<n; i++) {
				a[i] = s.nextLong();
			}
			System.out.println(sigleNumber(a));
			s.close();
		}
	}

	private static long sigleNumber(long[] a) {
		// TODO Auto-generated method stub
		long ones = 0;
		long twos = 0;
		long threes = 0;
		for(int i=0; i<a.length; i++) {
			twos ^= (ones & a[i]);
			ones ^= a[i];
			threes = ~(ones & twos);
			twos &= threes;
			ones &= threes;
		}
		return ones;
	}
}
//超时