package com.thinking.in.java.code;

import java.util.Random;

public class P46T7 {
	public static void main(String args[]) {
		Random rand = new Random(47);
		int j;
		int count=0;
		for(int i=0;i<10000;i++) {
			j = rand.nextInt(100);
			System.out.println(j);
			if(j>49) {
				count++;
			}
		}
		System.out.println(count);
	}
}
