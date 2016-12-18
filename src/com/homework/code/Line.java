package com.homework.code;

public class Line {
	private Point p1,p2;
	
	public Line(Point p1,Point p2) throws Exception {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Line(int x1,int y1,int x2,int y2) {
		this.p1.setLocation(x1,y1);
		this.p2.setLocation(x2,y2);
	}
	
	public Line() {
		
	}
	
	public String toString() {
		return p1 + "-" + p2;
	}
	
	public static double length(Point p1,Point p2) {
		int i = (p1.getX()-p2.getX()) * (p1.getX()-p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY());
		double d = Math.sqrt((double)i);
		return d;
	}
	
	
	
}
