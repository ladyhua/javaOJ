package com.thinking.in.java.code;

import static com.thinking.in.java.code.Signal.*;
public class P594T1 {
	private Signal color = RED;
	public void change() {
		switch(color) {
		case RED: color = GREEN;
		break;
		case GREEN: color = YELLOW;
		break;
		case YELLOW: color = RED;
		break;
		}
	}
	@Override
	public String toString() {
		return "The traffic light is " + color;
	}
	
	public static void main(String args[]) {
		P594T1 p = new P594T1();
		for(int i=0; i<100; i++) {
			System.out.println(p);
			p.change();
		}
	}
}
