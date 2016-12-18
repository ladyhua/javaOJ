package com.thinking.in.java.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P301T10 {
	public static void main(String args[]) {
		String[] strs = { "^Java","\\Breg.*","n.w\\s+h(a|i)s","s?","s+","s{4}","s{1}","s{0,3}" };
		for(String str : strs) {
			Pattern p = Pattern.compile(str);
			Matcher m = p.matcher("Java now has regular expressions");
			/*System.out.println(m.find());*/
			while(m.find()) {
				System.out.println("Match \""+m.group() +"\" at positions" + m.start() +"-" +(m.end()-1));
			}
		}
	}
}
