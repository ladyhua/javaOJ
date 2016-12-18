package com.thinking.in.java.code;

import java.io.IOException;
import java.io.StringReader;

public class P541Up {
	public static void main(String args[]) {
		StringReader in = new StringReader("fsidjfjwifeniwofjmslkafnoiawefawmiowafenamweoi;f");
		int c=0;
		try {
			while((c = in.read()) != -1)
				System.out.println((char)c);
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
