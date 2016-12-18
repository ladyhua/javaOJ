	package com.leetcode.code;

public class Main21 {
	public static void main(String args[]) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1);
		ListNode ln = mergeTwoLists(l1, l2);
		while(ln != null) {
			System.out.print(ln.val + " ");
			ln = ln.next;
		}
	}
	public static ListNode mergeTwoLists(ListNode l1,ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		ListNode newList;
		if(l1.val < l2.val) {
			newList = new ListNode(l1.val);
			l1 = l1.next;
		} else {
			newList = new ListNode(l2.val);
			l2 = l2.next;
		}
		ListNode res = newList;
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				res.next = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				res.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			res = res.next;
		}
		if(l1 != null) {
			while(l1 != null) {
				res.next = new ListNode(l1.val);
				res = res.next;
				l1 = l1.next;
			}
		}
		if(l2 != null) {
			while(l2 != null) {
				res.next = new ListNode(l2.val);
				res = res.next;
				l2 = l2.next;
			}
		}
		return newList;
	}
}
