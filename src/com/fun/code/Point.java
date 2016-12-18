package com.fun.code;
//样本点类
public class Point {
	private int x;
	private int y;
	//样本点的构造方法，方便初始化
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	//计算两点间的距离
	public double getDistance(Point p) {
		int dd = (p.getX() - this.getX())*(p.getX() - this.getX()) + (p.getY() - this.getY())*(p.getY() - this.getY());
		double distance = Math.sqrt(dd);
		
		return distance;
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
