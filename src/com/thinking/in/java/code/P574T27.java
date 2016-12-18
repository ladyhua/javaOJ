package com.thinking.in.java.code;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class FirstClass implements Serializable{
	public FirstClass(int i,char c) {
		this.i = i;
		sc = new SecondClass(c);
	}
	int i;
	SecondClass sc;
	@Override
	public String toString() {
		return i+"" + sc;
	}
}

class SecondClass implements Serializable {
	char c;
	public SecondClass(char c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return c +"";
	}
}
public class P574T27 {
	public static void main(String args[]) {
		FirstClass fc = new FirstClass(1,'a');
		ObjectInputStream ois;
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\java\\testSerializable.txt"));
			ois = new ObjectInputStream(new FileInputStream("d:\\java\\testSerializable.txt"));
			oos.writeObject(fc);
			oos.flush();
			oos.close();
			FirstClass fc1 = (FirstClass)ois.readObject();
			System.out.println(fc1);
			ois.close();
		}catch (ClassNotFoundException cfe) { 
			cfe.printStackTrace();
	    }catch (IOException e) {
			e.printStackTrace();
		} 
			
		
	}
}
