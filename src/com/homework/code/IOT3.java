package com.homework.code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOT3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入当前目录：");
		String path = scanner.nextLine().trim();
		System.out.println("请输入操作符号：");
		String op = scanner.nextLine().trim();
		if(op.equals("dir")) {
			getListFile(path);
		} else {
			String[] ops = op.split(" ");
			if(ops[0].equals("md")) {
				md(ops[1]);
			}
			if(ops[0].equals("copy")) {
				copy(ops[1],ops[2]);
			}
			if(ops[0].equals("move")) {
				move(ops[1],ops[2]);
			}
		}
		scanner.close();
	}
	
	 
	/** 
	 * @显示当前目录的所有文件和子目录
	 * @author hlz
	 * @param path  
	 */
	  	
	public static void getListFile(String path) {
		File file = new File(path);
		File[] list = file.listFiles();
		for(File f : list) {
			System.out.println(f.getName());
		}
	}
	
	 
	/** 
	 * @在指定目录创建一个文件夹 
	 * @author hlz
	 * @param path  
	 */
	  	
	public static void md(String path) {
		File file = new File(path);
		if(file.mkdirs()) {
			System.out.println("创建目录成功");
		} else {
			System.out.println("创建目录失败");
		}
		
	}
	
	 
	/** 
	 * @从目录path1复制一个文件到怕他和path2 
	 * @author hlz
	 * @param path1
	 * @param path2  
	 */
	  	
	public static void copy(String path1,String path2) {
		int c;
		File file1 = new File(path1);
		File file2 = new File(path2);
		FileReader fr = null;
		FileWriter fw = null;
		try{
			fr = new FileReader(file1);
			fw = new FileWriter(file2,true);
			while((c = fr.read()) != -1) {
				System.out.println(c);
				fw.write(c);
			}
			fr.close();
			fw.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("文件已复制");
	}
	
	 
	/** 
	 * @将path1的文件转移到path2 
	 * @author Administrator
	 * @param path1
	 * @param path2  
	 */
	  	
	public static void move(String path1,String path2) {
		copy(path1,path2);
		File file = new File(path1);
		if(file.delete()) {
			System.out.println("原文件已删除");
		}else {
			System.out.println("原文件删除失败");
		}
	}
}
