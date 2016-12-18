package com.thinking.in.java.code;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class P541Down {
	public static void main(String args[]) throws IOException{
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\java\\LoadWordDictionary.java")));
		while(in.available() != 0) {
			System.out.print((char)in.readByte());
		}
		in.close();
	}
}
