package com.fun.code;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class OrderCoderTest {
	public static String getFiveRandom() {
		Random rand = new Random();
		String strRan = rand.nextInt(100000) + "";
		switch(strRan.length()) {
		case 1: strRan = "000" + strRan;break;
		case 2: strRan = "00" + strRan; break;
		case 3: strRan = "0" + strRan; break;
		}
		return strRan;
	}
	public String createCoder(Date d) {
		String date = new SimpleDateFormat("yyMMddHHmmssSSS").format(d);
		System.out.println(date);
		return date + getFiveRandom();
	}
	public static void main(String args[]) {
		OrderCoderTest oc = new OrderCoderTest();
		System.out.println(oc.createCoder(new Date()));
	}
}	
