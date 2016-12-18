package com.bupt.code;

import java.util.Scanner;

public class Main0089 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String first,end;
		String firsts[],ends[];
		int startHour,startMinute,endHour,endMinute;
		while(n-->0) {
			first = s.nextLine();
			firsts = first.split(":");
			startHour = Integer.parseInt(firsts[0]);
			startMinute = Integer.parseInt(firsts[1]);
			end=s.nextLine();
			ends = end.split(":");
			endHour = Integer.parseInt(ends[0]);
			endMinute = Integer.parseInt(ends[1]);
			System.out.println((endHour-startHour)*60+(endMinute-startMinute));
		}
		s.close();
	}
}
