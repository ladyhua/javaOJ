package com.homework.code;

import java.util.Arrays;

public class Array {
	public static int max(int table[]) {
		int max = table[0];
		for(int i:table) {
			if(i > max) max = i;
		}
		return max;
	}
	
	public static int min(int table[]) {
		int min = table[0];
		for(int i:table) {
			if(i <min) min = i; 
		}
		return min;
	}
	
	public static int indexof(int table[] ,int key) {
		for(int i=0;i<table.length;i++) {
			if(table[i] == key) return i;
		}
		return -1;
	}
	
	public static void sort(int table[]) {
		Arrays.sort(table);
		for(int i:table) {
			System.out.println(i);
		}
	}
	
	public static boolean isSorted(int table[]) {
		boolean b = true;
		if(table[0] > table[1]) {
			for(int i=1;i<table.length-1;i++) {
				if(table[i] < table[i+1]) b = false;
			}
		}else if(table[0] <table[1]){
			for(int i=1;i<table.length-1;i++) {
				if(table[i] > table[i+1]) b= false;
			}
		}else {
			return isSorted(Arrays.copyOfRange(table, 1, table.length));
		}
		return b;
	}
	
	public static void main(String[] args) {
		int[] table = {2,2,2,2,4,6};
		System.out.println(max(table));
		System.out.println(min(table));
		System.out.println(indexof(table,3));
		System.out.println(isSorted(table));
		sort(table);
		
	}
}
