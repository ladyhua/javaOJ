package com.leetcode.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Twitter {
	List<Integer> tweet;
	Map<Integer,Integer> map;
	Map<Integer,Set<Integer>> followed;
	public Twitter() {
		tweet = new ArrayList<Integer>();
		map = new HashMap<Integer,Integer>();
		followed = new HashMap<Integer,Set<Integer>>();
	}
	public void postTweet(int userId,int tweetId) {
		map.put(tweetId, userId );
		tweet.add(tweetId);
	}
	public List<Integer> getNewsFeed(int userId) {
		Set<Integer> set = followed.get(userId);
		if(set == null) set = new HashSet<Integer>();
		List<Integer> res = new ArrayList<Integer>();
		int count = 0;
		for(int i=tweet.size()-1; i>=0; i--) {
			if(count >= 10) break;
			if(set.contains(map.get(tweet.get(i))) || map.get(tweet.get(i)) == userId) {
				res.add(tweet.get(i));
				count++;
			}
		}
		return res;
	}
	public void follow(int followerId,int followeeId) {
		Set<Integer> set = followed.get(followerId);
		if(set == null) {
			set = new HashSet<Integer>();
		}
		set.add(followeeId);
		followed.put(followerId, set);
	}
	public void unfollow(int followerId,int followeeId) {
		Set<Integer> set = followed.get(followerId);
		if(set == null) set = new HashSet<Integer>();
		set.remove(followeeId);
		followed.put(followerId, set);
	}
}
