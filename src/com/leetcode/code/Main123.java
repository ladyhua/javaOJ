package com.leetcode.code;

public class Main123 {
	public static void main(String args[]) {
		int[] prices = {2,3,4,9,2,7,2,3,5,6};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0) {
			return 0;
		}
		int[] left = new int[prices.length];
		int[] right = new int[prices.length];
		int min = prices[0];
		int max = prices[prices.length-1];
		for(int i=1; i<left.length; i++) {
			left[i] = Math.max(left[i-1], prices[i]-min);
			min = Math.min(min, prices[i]);
		}
		for(int i=right.length-2; i>=0; i--) {
			right[i] = Math.max(right[i+1], max-prices[i]);
			max = Math.max(max, prices[i]);
		}
		int profit = 0;
		for(int i=0; i<prices.length; i++) {
			profit = Math.max(profit, left[i]+right[i]);
		}
		return profit;
	}
}
