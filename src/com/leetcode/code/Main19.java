package com.leetcode.code;

import java.util.ArrayList;
import java.util.List;

public class Main19 {
	public static void main(String args[]) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		l1 = removeNthFromEnd(l1, 2);
		while(l1 != null) {
			System.out.print(l1.val + " ");
			l1 = l1.next;
		}
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		List<ListNode> list = new ArrayList<ListNode>();
		ListNode ln = head;
		while(ln != null) {
			list.add(ln);
			ln = ln.next;
		}
		if(list.size() == n) return head.next;
		ListNode rdelete = list.get(list.size() - n - 1);
		if(n == 1) {
			rdelete.next = null;
		} else {
			rdelete.next = list.get(list.size() - n + 1);
		}
		return head;
	}
}
