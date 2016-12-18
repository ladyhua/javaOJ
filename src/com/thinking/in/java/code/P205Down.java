package com.thinking.in.java.code;

public class P205Down {
	public static void main(String args[]) {
		Out out = new Out();
		Out.Inner outI = out.new Inner();
		Out.Inner.A outIA = outI.new A();
		outIA.w();
	}
}

class Out {
	private void f() {
		System.out.println("f()");
	}
	class Inner {
		private void g() {
			System.out.println("g()");
		}
		class A {
			void w() {
				f();
				g();
			}
		}
	}
}