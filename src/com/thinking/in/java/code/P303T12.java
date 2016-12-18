package com.thinking.in.java.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P303T12 {
	static int count;
	static public final String POEM = "Twas brillig. and the slithy toves\n" + "Did gyre and gimble in the wabe.\n" +
			"All mimsy were the borogoves.\n" + "And the mome raths outgrabe.\n\n" + "Beware the Jabberwock. my son.\n" +
			"The jaws that bite. the Claws that catch.\n" + "Beware the Jubjub bird. and shun\n" + "The frumious Bandersnatch.";
	public static void main(String args[]) {
		Pattern p =Pattern.compile("\\b[a-z]\\w+\\b");
		Matcher m = p.matcher(POEM);
		while(m.find()) {
			count++;
			System.out.println("Mathched \"" + m.group() + "\" at positions" + m.start() + "-" +m.end());
		}
		System.out.println(count);
	}
}
