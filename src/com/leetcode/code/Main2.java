package com.leetcode.code;
//AC
public class Main2 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = l1;
		l1.next = new ListNode(4);
		l1 = l1.next;
		l1.next = new ListNode(3);
		
		ListNode l3 = new ListNode(5);
		ListNode l4 = l3;
		l3.next = new ListNode(6);
		l3 = l3.next;
		l3.next = new ListNode(4);
		ListNode l = addTwoNumbers(l2,l4);
		System.out.print(l.val);
		while(l.next!=null) {
			l = l.next;
			System.out.print("->"+l.val);
		}
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*ListNode l3 = new ListNode(-1);
        ListNode l4 = l3;
        l3.val = l1.val + l2.val;
        while(l1.next!=null) {
        	l1 = l1.next;
        	
        	l2 = l2.next;
        	l3.next = new ListNode((l1.val+l2.val)%10);
        	l3 = l3.next;
        }
        return l4;*/
		ListNode l3 = new ListNode(-1);
		ListNode l4 = l3;
		int jw = (l1.val + l2.val)/10;
		int temp2;
		l3.val = (l1.val + l2.val)%10;
		while(l1.next != null || l2.next !=null || jw !=0) {
			if(l1.next == null) {
				l1.next = new ListNode(0);
			}
			if(l2.next == null) {
				l2.next = new ListNode(0);
			}
			l1 = l1.next;
			l2 = l2.next;
			temp2 = (l1.val + l2.val + jw)%10;
			jw = (l1.val + l2.val +jw)/10;
			l3.next = new ListNode(temp2 );
			l3 = l3.next;
		}
		return l4;
    }
}
