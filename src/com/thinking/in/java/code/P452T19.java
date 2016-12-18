package com.thinking.in.java.code;

import java.util.Arrays;

public class P452T19 {
	private int i;
	public P452T19 (int i) {
		this.i = i;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof P452T19) {
			P452T19 p = (P452T19)o;
			return p.i == this.i;
		} else {
			return false;
		}
	}
	public static void main(String args[]) {
		P452T19[] p1 = new P452T19[]{new P452T19(1), new P452T19(2) };
		P452T19[] p2 = { new P452T19(1), new P452T19(2) };
		System.out.println(Arrays.equals(p1, p2));
	}
}
