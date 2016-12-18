package com.leetcode.code;

/** 
 * @Description 
 * @author hlz
 * @date 2016年8月24日 下午3:41:23 
 * @version V1.0
 */ 
  	
public class Main121 {
	public static void main(String args[]) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length < 2) {
			return 0;
		}
		int profit = 0;
		int min = prices[0];
		for(int i=1; i<prices.length; i++) {
			if(prices[i] > min) profit = Math.max(profit, prices[i] - min);
			min = Math.min(min, prices[i]);
		}
		return profit;
	}
}
