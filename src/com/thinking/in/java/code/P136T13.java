package com.thinking.in.java.code;

class Person{
	public void write(int i) {
		System.out.println("write int");
	}
	public void write(float f) {
		System.out.println("write float");
	}
	public void write(String s) {
		System.out.println("write String");
	}
}
class Student extends Person {
	public void write(double d) {
		System.out.println("write double");
	}
}
public class P136T13 {
	public static void main(String[] args) {
		Student s = new Student();
		s.write(1.0);
	}
	

}
