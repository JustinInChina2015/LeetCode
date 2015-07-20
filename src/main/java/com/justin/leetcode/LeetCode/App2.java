package com.justin.leetcode.LeetCode;

public class App2 {
	protected static int cnt = 0;
	
	public static void main (String[] args) {
		TreeNode tree = new TreeNode(0);
		tree.left = new TreeNode(1);
		System.out.println(minDepth(tree));
	}
	
	public static int minDepth(TreeNode root) {
		if (root == null){
			return 0;
		}
		else {
			cnt++;
			if (root.left != null || root.right != null){
				cnt = Math.min(minDepth(root.left), minDepth(root.right));
			} else {
				return cnt;
			}
		}
		return cnt++;
	}
}
