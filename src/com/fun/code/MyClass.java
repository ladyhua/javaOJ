package com.fun.code;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
	private int x;
	private int y;
	public MyClass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object o){
		if(o == this) {
			return true;
		}
		if(!(o instanceof MyClass)) {
			return false;
		}
		MyClass mc = (MyClass)o;
		return mc.x == x && mc.y == y;
	}
	/*@Override
	public int hashCode() {
		return Integer.hashCode(x);
	}*/
	@Override
	public String toString(){
		return x+","+y;
	}
	
	public static void main(String[] args) {
		//用Integer作为map的键，可以通过新的Integer对象找到对应的值，说明Integer类重写了equles和hashcode方法
	/*	MyClass mc = new MyClass(1,2);
		Map<Integer,MyClass> map = new HashMap<Integer,MyClass>();
		map.put(1, mc);
		System.out.println(map.get(1));*/
		
		//不重写hashcode方法无法作为map里的键值
		MyClass mc = new MyClass(1,2);
		MyClass mc1 = new MyClass(1,2);
		System.out.println(mc.equals(mc1));
		Map<MyClass,Integer> map = new HashMap<MyClass,Integer>();
		map.put(mc, 1);
		System.out.println(map.get(new MyClass(1,2)));
	}
}
