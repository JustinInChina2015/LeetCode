package com.justin.leetcode.LeetCode;

import java.util.*;
import java.math.*;

/**
 * Palindrome Detector
 */
public class App1
{
    public static void main( String[] args )
    {
    	int isPalin = 1001001;
    	int isNotPalin = 121650;
    	int test = 2112;
    	
        System.out.println(test);
        System.out.println(issPalindrome(test));
    }
    
    public static boolean isPalindrome(int x) {
    	Deque<Integer> deq = new LinkedList<Integer>();
    	
    	// negative numbers always not palindrome
    	if (x<0)
    		return false;
    	// acquire individual digits of x
    	while (x>0) {
    		deq.add(x%10);
    		x = x/10;
    	}
    	while(deq.size()>1) {
    		if (deq.removeLast() != deq.removeFirst())
    			return false;
    	}
    	return true;
    }
    public static boolean issPalindrome(int x) {
    	if (x<0)
    		return false;
    	String word = Integer.toString(x);
    	char[] words = new char[word.length()];
        int i1 = 0;
        int i2 = words.length - 1;
        while (i2 > i1) {
            if (words[i1] != words[i2]) {
               return false;
           }
           ++i1;
            --i2;
        }
        return true;
    }
}
