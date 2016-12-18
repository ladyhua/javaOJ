package com.homework.code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOT2 {
	public static void main(String args[]) {
		String filename = "d://java//IOT2Test.txt";
		IOT2.writeTo(filename);
		System.out.println("-----------------------read------------------------");
		IOT2.readFrom(filename);
	}
	
	public static void writeTo(String filename) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fow = null;
		try {
			fow = new FileWriter(filename);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fow);
		String s = null;
		try {
			s = br.readLine();
			while(s != null) {
				if(s.equals("exit")) break;
				bw.write(s);
				bw.newLine();
				s = br.readLine();
			}
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void readFrom(String filename) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		String s = null;
		try {
			s = br.readLine();
			while(s != null) {
				System.out.println(s);
				s = br.readLine();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
