package com.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class Main138 {
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head == null) return null;
		Map<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
		RandomListNode newHead = new RandomListNode(head.label);
		map.put(head, newHead);
		RandomListNode newNode;
		RandomListNode node = head.next;
		while(node != null) {
			newNode = new RandomListNode(node.label);
			map.put(node, newNode);
			node = node.next;
		}
		for(RandomListNode rln : map.keySet()) {
			map.get(rln).next = map.get(rln.next);
			map.get(rln).random = map.get(rln.random);
		}
		return newHead;
	}
}
