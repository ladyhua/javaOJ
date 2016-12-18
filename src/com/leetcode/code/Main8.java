package com.leetcode.code;
//AC
public class Main8 {
	public static void main(String args[]) {
		System.out.println(myAtoi("-2147483649"));
	}
	public static int myAtoi(String str) {
		long lresult = 0l;
		int changeTime = 0;
		boolean b = false;
		boolean isFu = false;
		char[] c = str.toCharArray();
		for(int i=0; i<c.length; i++) {
			
			if(c[i] == '-') {
				b = true;
				isFu = true;
				changeTime ++;
				continue;
			}
			if(c[i] == '+') {
				b = true;
				changeTime ++;
				continue;
			}
			if(c[i] < '0' || c[i] > '9' ) {
				if(b ) {
					break;
				} else {
					if(c[i] != ' ' && c[i] != '+' && c[i] != '-') {
						break;
					} else {
						continue;
					}
				}
				
			} else {
				b = true;
				lresult = lresult * 10 + Integer.parseInt(c[i]+"");
			}
			if(lresult == 2147483648l && isFu == true) {
				return Integer.MIN_VALUE;
			}
			if(lresult > Integer.MAX_VALUE ) {
				if(isFu == false) {
					return Integer.MAX_VALUE;
				} else {
					return Integer.MIN_VALUE;
				}
			}
		}
		if(isFu) {
			lresult = -lresult;
		}
		
		if(changeTime >1) {
			lresult = 0;
		}
		return (int)lresult;
	}
}
