package com.leetcode.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

public class RandomizedCollection {
	private List<Integer> list;
	private Map<Integer,TreeSet<Integer>> map;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
    	list = new ArrayList<Integer>();
    	map = new HashMap<Integer,TreeSet<Integer>>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        list.add(val);
    	if(map.containsKey(val)) {
        	map.get(val).add(list.size()-1);
        	return false;
        }
    	TreeSet<Integer> set = new TreeSet<Integer>();
    	set.add(list.size()-1);
    	map.put(val, set);
    	return true;
        
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
    	if(!map.containsKey(val)) {
    		return false;
    	}
    	TreeSet<Integer> set = map.get(val);
    	int index = set.pollLast();
    	if(index != list.size()-1) {
    		list.set(index, list.get(list.size()-1));
    		int changedNum = list.get(list.size()-1);
    		TreeSet<Integer> set2 = map.get(changedNum);
    		set2.pollLast();
    		set2.add(index);
    	}
    	list.remove(list.size()-1);
    	if(set.isEmpty()) {
    		map.remove(val);
    	}
    	return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
    	Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}