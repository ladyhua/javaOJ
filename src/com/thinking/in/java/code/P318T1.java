package com.thinking.in.java.code;

class Toy {
	/*public Toy(){
		
	}*/
	public Toy(int i) {
		
	}
}
public class P318T1 {
	public static void main(String args[]) {
		Class c = null;
		try {
			c = Class.forName("com.thinking.in.java.code.Toy");
		}catch(ClassNotFoundException e) {
			System.out.println("can't find class Toy");
			System.exit(1);
		}
		Object obj = null;
		try {
			obj = c.newInstance();
		} catch (InstantiationException e) {
			System.out.println("can't instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("can't access");
			System.exit(1);
		}
		System.out.println(obj.getClass());
	}
}
