package com.homework.code;

public class Point {
	private int x,y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		
	}
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	@Override
	public String toString() {
		return "("+ x +"," + y + ")";
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Point getLocation() {
		return this;
	}
	
	public void setLocation(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public void setLocation(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
