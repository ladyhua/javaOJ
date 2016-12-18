package com.thinking.in.java.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//P358T6
public class RandomList<T> {
	private List<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	public void add(T t) {
		storage.add(t);
	}
	public static void main(String args[]) {
		RandomList<Integer> rl = new RandomList<Integer>();
		int[] ints = new int[]{1,2,3,4,5,6,7,8,9};
		for(int i : ints) {
			rl.add(i);
		}
		for(int i=0; i<20; i++) {
			System.out.print(rl.select()+" ");
		}
	}
}
