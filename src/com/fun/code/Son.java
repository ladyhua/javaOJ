package com.fun.code;

import java.util.Date;

public class Son extends Father{
	private final Date date;
	public Son() {
		super();
		date = new Date();
	}
	
	@Override
	public void overrideMe() {
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		Son son = new Son();
		son.overrideMe();
	}
}
