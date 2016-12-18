package com.thinking.in.java.code;

class Amphibian{
	public void write(){
		System.out.println("Amphibian");
	}
	public static void test(Amphibian a) {
		a.write();
	}
}
class Frog extends Amphibian{
	@Override
	public void write() {
		System.out.println("Frog");
	}
	public void read() {
		System.out.println("read");
	}
}
public class P140T16 {
	public static void main(String[] args) {
		Frog f = new Frog();
		Amphibian.test(f);
	}
	
	
}
