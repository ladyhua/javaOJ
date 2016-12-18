package com.leetcode.code;

public class Main122 {
	public static void main(String args[]) {
		int[] prices = {7,2,3,4,5,8,6,2,4};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length < 2) return 0;
		int profit = 0;
		for(int i=1; i<prices.length; i++) {
			if(prices[i] > prices[i-1]) {
				profit += (prices[i] - prices[i-1]);
			}
		}
		return profit;
	}
}
