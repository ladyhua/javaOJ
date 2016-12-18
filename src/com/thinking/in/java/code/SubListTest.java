package com.thinking.in.java.code;
//sublist指向原list，sublist里面改变顺序，原list也改变
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SubListTest {
	public static void main(String args[]) {
		Random rnd = new Random(47);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
			list.add(i);
		List<Integer> subList = list.subList(0, 3);
		Collections.shuffle(subList, rnd);
		System.out.println("shuffled subList:"+subList);
		System.out.println("orign List:"+list);
	}
}
