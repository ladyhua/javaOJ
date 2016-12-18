package com.fun.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Classify {
	public static void main(String[] args) {
		int threshold = 4;	//阈值
		Point p1 = new Point(18,90);
		Point p2 = new Point(11,67);
		Point p3 = new Point(57,68);
		Point p4 = new Point(75,59);
		Point p5 = new Point(36,42);
		Point p6 = new Point(62,18);
		List<Point> centerList = new ArrayList<Point>();
		List<Point> pointList = new ArrayList<Point>();
		Map<Point,List<Point>> result = new HashMap<Point,List<Point>>();
		centerList.add(p1);
		pointList.add(p1);
		pointList.add(p2);
		pointList.add(p3);
		pointList.add(p4);
		pointList.add(p5);
		pointList.add(p6);
		List<Point> l = new ArrayList<Point>();
		l.add(p1);
		result.put(p1, l);
		boolean bEnd = false;	//记录聚类中心是否改变
		while(bEnd == false) {
			for(int i=1;i<pointList.size();i++) {	//遍历所有样本
				boolean b = false; //记录是否被归类
				double shortDis = 0.0; //记录最短距离
				Map<Double,Point> m = new HashMap<Double,Point>();	//记录距离和哪个聚类中心对应
				Point pFirst = pointList.get(i);
				for(int j=0;j<centerList.size();j++) { 	//对每个样本遍历聚类中心
					Point pSecond = centerList.get(j);
					double d = pSecond.getDistance(pFirst);
					if(d<threshold) {	//若距离小于阈值
						b = true;
						m.put(d, pSecond);
						if(shortDis == 0) {
							shortDis = d;
						} else if(shortDis>d) {
							shortDis = d;
						}
					}
				}
			
				if(b == false) {	//若未被分类
					bEnd = true;	//聚类中心改变
					centerList.add(pFirst);
					List<Point> ll = new ArrayList<Point>();
					ll.add(pFirst);
					result.put(pFirst, ll);
				}else {			//被分类
					Point pp = m.get(shortDis);	//通过最短距离得到聚类中心
					int t;
					List<Point> llist = result.get(pp);
					if(!llist.contains(pFirst)) {	//判断该类中是否有点，如果有点，聚类中心要改变
						bEnd = true;
						llist.add(pFirst);
						int xcount = 0;
						int ycount = 0;
						for(t=0;t<llist.size();t++) {
							xcount += llist.get(t).getX();
							ycount += llist.get(t).getY();
						}
						int index = centerList.indexOf(pp);
						centerList.remove(index);
						Point ppp = new Point(xcount/t,ycount/t);
						result.remove(pp);
						centerList.add(ppp);
						result.put(ppp, llist);
					}
				}
			}
		}
			//输出结果
		Iterator<Map.Entry<Point, List<Point>>> it = result.entrySet().iterator();
		int i = 1;	//计数器
		while (it.hasNext()) {
		   Map.Entry<Point, List<Point>> entry = it.next();
		   List<Point> resultList = entry.getValue();
		   System.out.print("第"+i+"类的点有：");
		   for(int j=0;j<resultList.size();j++) {
			   Point resultPoint = resultList.get(j);
			   System.out.print("("+resultPoint.getX()+","+resultPoint.getY()+")"+" ");
		   }
		   System.out.println();
		   i++;
		}
	}
}
