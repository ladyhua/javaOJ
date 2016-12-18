package com.thinking.in.java.code;

import java.util.ArrayList;
import java.util.List;

public class P67T4 {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=2;i<100;i++) {
			if(i == 2 || i == 3){
				list.add(i);
				continue;
			}
			boolean b = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j == 0) {
					b = false;
				}
			}
			if(b) {
				list.add(i);
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
