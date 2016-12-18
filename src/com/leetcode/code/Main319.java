package com.leetcode.code;

public class Main319 {
	public static void main(String args[]) {
		int count=bulbSwitch(9999999);
		System.out.println(count);
	}
	public static int bulbSwitch(int n) {
        int count = 0; //记录最终亮灯的个数
        int[] a = new int[n];
        for(int i=0; i<n; i++){
        	a[i] = 1;
        }
        for(int i=1; i<n; i++){
        	int j = i+1; //记录第几趟
        	int k = i;   
        	while(k < n) {
        		if(a[k] == 0) {
        			a[k] = 1;
        		}else {
        			a[k] = 0;
        		}
        		k += j;
        	}
        }
        for(int i=0; i<n; i++){
        	if(a[i] == 1){
        		count++;
        	}
        }
		return count;
        
    }
}
