package com.thinking.in.java.code;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class P540T7 {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		
		try{
			
			BufferedReader br = new BufferedReader(new FileReader("D:\\java\\LoadWordDictionary.java"));
			PrintWriter out = new PrintWriter("F:/LWD.txt");
			String s = "";
			while((s = br.readLine()) != null) {
				list.add(s);
			}
			br.close();
//			for(int i=list.size()-1; i>-1;i--) {
//				if(list.get(i).contains(args[1])) {
//					System.out.println(list.get(i).toUpperCase());
//				}
//			}
			for(int i=0; i<list.size(); i++) {
				out.println(((i+1) + " : " +list.get(i))); 
			}
			//没有flush和close无法显示，紧急必须flush和close
			out.flush();
			out.close();
		}catch (FileNotFoundException ffe) {
			ffe.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
