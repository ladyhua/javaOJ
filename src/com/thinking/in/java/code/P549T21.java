package com.thinking.in.java.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P549T21 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		try {
			while((s = br.readLine()) != null) {
				System.out.println(s.toUpperCase());
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
