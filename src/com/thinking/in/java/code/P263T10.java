package com.thinking.in.java.code;
class MyException1 extends Exception {
	public MyException1() {
		
	}
	public MyException1(String s) {
		super(s);
	}
}

class MyException2 extends Exception {
	public MyException2() {
		
	}
	public MyException2(String s) {
		super(s);
	}
}
public class P263T10 {
	public static void g() throws MyException1 {
		throw new MyException1("MyException1 in g()");
	}
	public static void f() throws MyException2{
		try {
			g();
		} catch (MyException1 me1) {
			me1.printStackTrace();
			MyException2 me2 = new MyException2("MyException2 in f()");
			me2.initCause(me1);
			throw me2;
		}
	}
	public static void main(String args[]) {
		try {
			f();
		} catch(MyException2 me2) {
			me2.printStackTrace();
		}
	}
}
