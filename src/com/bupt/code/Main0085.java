package com.bupt.code;

import java.util.Scanner;

public class Main0085 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0) {
			int t = s.nextInt();
			double a[][]=new double[t][2]; 
			for(int i=0; i<t; i++) {
				a[i][0] = s.nextDouble();
				a[i][1] = s.nextDouble();
			}
			boolean b=testThreePoint(a);
			if(b==true) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		s.close();
	}

	private static boolean testThreePoint(double[][] a) {
		// TODO Auto-generated method stub
		boolean b=false;
		for(int i=0; i<a.length-2; i++) {
			for(int j=i+1; j<a.length-1; j++) {
				for(int k=j+1; k<a.length; k++) {
					if(a[i][0]==a[j][0]){
						if(a[k][0]==a[i][0]){
							b = true;
						}
					}else {
						if(a[k][0]!=a[i][0]) {
							if((a[k][1]-a[i][1])/(a[k][0]-a[i][0])==(a[j][1]-a[i][1])/(a[j][0]-a[i][0])){
								b=true;
							}
						}
					}
				}
			}
		}
		return b;
	}
}


	

