package com.justin.leetcode.LeetCode;

import java.util.*;

public class App4 {
	public static void main(String[] args) {
		ListNode list = new ListNode(-16557);
		list.next = new ListNode(-8725);
		list.next.next = new ListNode(-29125);
		list.next.next.next = new ListNode(28873);
		list.next.next.next.next = new ListNode(-21702);
		list.next.next.next.next.next = new ListNode(15483);
		list.next.next.next.next.next.next = new ListNode(-28441);
		list.next.next.next.next.next.next.next = new ListNode(-17845);
		list.next.next.next.next.next.next.next.next = new ListNode(-4317);
		list.next.next.next.next.next.next.next.next.next = new ListNode(-10914);
		list.next.next.next.next.next.next.next.next.next.next = new ListNode(-10914);
		list.next.next.next.next.next.next.next.next.next.next.next = new ListNode(-4317);
		list.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(-17845);
		list.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(-28441);
		list.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(15483);
		list.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(-21702);
		list.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(28873);
		list.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(-29125);
		list.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(-8725);
		list.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(-16557);	
		
		while (list.next != null){
			System.out.println(list.val);
			list = list.next;
		} System.out.println(list.val);
		System.out.println(isPalindrome(list));
	}
	
	public static boolean isPalindrome(ListNode head) {
		if (head==null)
			return true;
		Deque<Integer> deq = new LinkedList<Integer>();
		while (head.next!=null){
			deq.add(head.val);
			head = head.next;
		} deq.add(head.val);
		System.out.println(deq.size());
		while(deq.size()>1){
			int a = deq.removeFirst();
			int b = deq.removeLast();
    		if (a != b)
    			return false;
    	}
		return true;
	}
}
