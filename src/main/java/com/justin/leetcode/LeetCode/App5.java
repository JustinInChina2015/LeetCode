package com.justin.leetcode.LeetCode;

import java.util.*;

public class App5 {
    public static void main(String[] args) {
    	int[] nums = {1,3,4,5,6,7};
    	System.out.println("length is: " + nums.length + "\n");
    	System.out.println(summaryRanges(nums));
    }
	
	public static List<String> summaryRanges(int[] nums) {
        List<String> sol = new ArrayList<String>();
        int lower, upper;
        
        for(int i=0;i<nums.length;i++) {
            lower = nums[i];
            while(i!= nums.length - 1 && nums[i] == nums[i+1]-1) {
            	i++;
            }
            upper = nums[i];
            if(lower == nums[i]) {
            	sol.add(new String(Integer.toString(lower)));
            } else {
            	sol.add(new String(lower + "->" + upper));
            }
        }
        return sol;
    }
}