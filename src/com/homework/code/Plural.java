package com.homework.code;

public class Plural {
	private double real;
	private double imag;
	
	public Plural(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public  Plural add(Plural a,Plural b) {
		Plural c = new Plural(a.real + b.real,a.imag + b.imag);
		return c;
	}
	
	public Plural add(Plural a) {
		Plural c = new Plural(a.real + real,a.imag + imag);
		return c;
	}
	
	public static Plural sub(Plural a,Plural b) {
		Plural c = new Plural(a.real - b.real,a.imag - b.imag);
		return c;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Plural)) {
			return false;
		}
		Plural p = (Plural)o;
		return p.imag == imag && p.real == real;
	}
	
	@Override
	public int hashCode(){
		return (int)(31*real + imag);
	}
	@Override
	public String toString() {
		return real + "+" +imag+"i"; 
	}
	
	public static void main(String[] args) {
		Plural p1 = new Plural(1.0,2.0);
		Plural p2 = new Plural(3.0,5.0);
		Plural p3 = new Plural(1.0,2.0);
		System.out.println(p1.add(p1,p2));
		System.out.println(p1.add(p2));
		System.out.println(sub(p1,p2));
		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));
		
		
	}
}
