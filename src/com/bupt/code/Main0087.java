package com.bupt.code;

import java.util.Scanner;

public class Main0087 {
	final static int[] leap={31,29,31,30,31,30,31,31,30,31,30,31};
	final static int[] notLeap={31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		while(n-- > 0) {
			String string = s.nextLine();
			String[] ss = string.split(":");
			if(ss.length==3) {
				int year = Integer.parseInt(ss[0]);
				int month = Integer.parseInt(ss[1]);
				int day = Integer.parseInt(ss[2]);
				int index = cmpIndex(year,month,day);
				System.out.println(index);
			}
		}
		s.close();
	}

	private static int cmpIndex(int year, int month, int day) {
		int index=0;
		if(year%100==0 && year%400==0 || year%100!=0 &&year%4==0) {
			if(month==1){
				
			}else {
				for(int i=0; i<month-1; i++){
					index += leap[i];
				}
			}
		}else {
			if(month==1){
				
			}else {
				for(int i=0; i<month-1; i++){
					index += notLeap[i];
				}
			}
		}
		return index+day;
	}
}
