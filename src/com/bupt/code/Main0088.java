package com.bupt.code;

import java.util.Scanner;

public class Main0088 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n-- > 0) {
			int t = s.nextInt();
			int a[] = new int[t];
			for(int i=0; i<t; i++) {
				a[i] = s.nextInt();
			}
			for(int i=0;i<2;i++) {
				for(int j=i+1; j<a.length; j++) {
					if(a[j]>a[i]) {
						int temp = a[j];
						a[j] = a[i];
						a[i] = temp;
					}
				}
			}
			System.out.println(a[0]+" "+a[1]);
		}
		s.close();
	}
}
