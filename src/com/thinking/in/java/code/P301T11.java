package com.thinking.in.java.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P301T11 {
	public static void main(String args[]) {
		Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
		Matcher m = p.matcher("Arline ate eight apples and one orange while Anita hadn't any iasdkfde");
		while(m.find()) {
			System.out.println("Matched \"" + m.group() +"\" at positions " + m.start() + "-" + (m.end()-1));
		}
	}
}
