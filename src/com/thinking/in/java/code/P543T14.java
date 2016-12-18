package com.thinking.in.java.code;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class P543T14 {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Windows\\System32\\drivers\\etc\\hosts"));
			String s = "";
			while((s = br.readLine()) != null) {
				list.add(s);
			}
			br.close();
			bufferOutput(list);
			noBufferOutput(list);
		} catch (FileNotFoundException ffe) {
			ffe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void bufferOutput(List list) throws IOException {
		Date startDate = new Date();
		PrintWriter pw = new PrintWriter("D:\\java\\bufferOutput.txt");
		for(int i=0; i<list.size(); i++) {
			pw.println((i+1) + ":" +list.get(i));
		}
		pw.flush();
		pw.close();
		Date endDate = new Date();
		System.out.println(endDate.getTime() - startDate.getTime());
		
	}
	
	public static void noBufferOutput(List<String> list) throws IOException {
		Date startDate = new Date();
		FileWriter fw = new FileWriter("D:\\java\\noBufferOutput.txt",true);
		for(int i=0; i<list.size(); i++) {
			fw.write((i+1) + ":" +list.get(i));
		}
		fw.flush();
		fw.close();
		Date endDate = new Date();
		System.out.println(endDate.getTime() - startDate.getTime());
	}
}
