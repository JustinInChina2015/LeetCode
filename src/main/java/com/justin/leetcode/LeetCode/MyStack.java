package com.justin.leetcode.LeetCode;

import java.util.*;

public class MyStack {
	private Queue<Integer> q1 = new LinkedList<Integer>();
    private Queue<Integer> q2 = new LinkedList<Integer>();
	
    // Push element x onto stack.
    public void push(int x) {
        q2.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	if(q2.size()==1){
    		q2.remove();
    	} else{
	    	while (q2.size()>1) {
				q1.add(q2.remove());
			}
			q2.remove();
			while (!q1.isEmpty()) {
				q2.add(q1.remove());
			}
    	}
    }

    // Get the top element.
    public int top() {
    	int target;
    	if(q2.size()==1){
    		target = q2.peek();
    	} else {
	    	while (q2.size()>1) {
				q1.add(q2.remove());
			}
			target = q2.peek();
			q1.add(q2.remove());
			while (!q1.isEmpty()) {
				q2.add(q1.remove());
			}
	    }
    	return target;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q2.isEmpty();
    }
}