package com.justin.leetcode.LeetCode;

import java.util.*;

public class MyQueue {
	private Stack<Integer> st1 = new Stack<Integer>();
    private Stack<Integer> st2 = new Stack<Integer>();
    
    public void push(int x) {
    	st2.push(x);
    }
	public void pop() {
		while (!st2.isEmpty()) {
			st1.push(st2.pop());
		}
		st1.pop();
		while (!st1.isEmpty()) {
			st2.push(st1.pop());
		}
	}
	public int peek() {
		while (!st2.isEmpty()) {
			st1.push(st2.pop());
		}
		int target = st1.peek();
		while (!st1.isEmpty()) {
			st2.push(st1.pop());
		}
		return target;
	}
	public boolean empty() {
		return st2.isEmpty();
	}
}
