package com.thinking.in.java.code;
class Shape {
	
}
class Circle extends Shape{
	
}
class Rhomboid extends Shape {
	
}
public class P318T3 {
	public static void main(String args[]) {
		Rhomboid r = new Rhomboid();
		System.out.println(r);
		Shape s = r;
		System.out.println(s);
		Rhomboid r1 = (Rhomboid)s;
		System.out.println(r1);
		//test start
		Shape circle = new Circle();
		System.out.println(circle instanceof Circle);
		//test end
		Circle c = null;
		if(s instanceof Circle) {
			System.out.println("true");
			c = (Circle)s;
		} else {
			System.out.println("false");
		}
		
		
		System.out.println(c);
	}
}
