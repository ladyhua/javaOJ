package com.leetcode.code;

public class Main204 {
	public static void main(String args[]) {
		System.out.println(countPrimes(20));
	}
	public static int countPrimes(int n) {
		boolean[] isPrime = new boolean[n];
		for(int i=2; i<n; i++) {
			isPrime[i] = true;
		}
		for(int i=2; i*i<n; i++) {
			if(!isPrime[i]) continue;
			for(int j=i*i; j<n; j+=i) {
				isPrime[j] = false;
			}
		}
		int count = 0;
		for(int i=2; i<n; i++) {
			if(isPrime[i]) count++;
		}
		return count;
	}
	/** 
	 * @Description 
	 * @author hlz
	 * @param n
	 * @return  
	 */
	  	
	public static int countPrimes1(int n) {
		int res = 0;
		if(n < 3) return 0;
		for(int i=2; i<n; i++) {
			boolean b = true;
			for(int j=2; j*j<=i; j++) {
				if(i%j == 0) {
					b = false;
					break;
				}
			}
			if(b) res++;
		}
		return res;
	}
}
