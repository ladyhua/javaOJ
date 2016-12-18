package com.thinking.in.java.code;

class Window {
	Window(int maket) {
		System.out.println("Window("+ maket + ")");
	}
}
class House {
	Window w1 = new Window(1);
	House() {
		System.out.println("House()");
		//w3 = new Window(33);
	}
	
	Window w2 = new Window(2);
	void f() {
		System.out.println("f()");
	}
	Window w3;
}
public class P94T1 {
	public static void main(String[] args) {
		House h = new House();
		h.f();
	}
}
