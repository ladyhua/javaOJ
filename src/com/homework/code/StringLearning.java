package com.homework.code;

public class StringLearning {
	public static String upperFirst(String str) {
		String[] strs = str.split(" ");
		String result = "";
		for(String s:strs) {
			s = s.substring(0,1).toUpperCase()+s.substring(1);
			result = result + s + " ";
		}
		return result;
	}
	
	public static int count(String str,char ch) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) count++;
		}
		return count;
	}
	
	public static String[] split(String str,char ch) {
		String[] strs = new String[100];
		int count = 0;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch) {
				String s = str.substring(0,i);
				strs[count++] = s;
				str = str.substring(i+1);
				i=0;
			}
		}
		strs[count++] = str;
		String[] strss = new String[count];
		for(int i=0;i<count;i++) {
			strss[i] = strs[i];
		}
		return strss;
	}
	public static void main(String[] args) {
		System.out.println(upperFirst("hello world"));
		System.out.println(count("hello world",'o'));
		String[] strs = split("helloworld",'o');
		for(String s:strs) {
			System.out.println(s);
		}
	}
}
