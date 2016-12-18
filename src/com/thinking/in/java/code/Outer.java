package com.thinking.in.java.code;
//P192T3
public class Outer {
	private String s;
	public Outer(String s) {
		this.s = s;
	}
	
	public Inner getInner() {
		return new Inner();
	}
	class Inner {
		public String toString() {
			System.out.println(s);
			return s;
		}
	}
	public static void main(String[] args) {
		Outer outer = new Outer("ladyhua");
		/*outer.getInner().toString();*/
		//同样的效果
		outer.new Inner().toString();
	}
}

