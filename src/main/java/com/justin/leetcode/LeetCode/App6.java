package com.justin.leetcode.LeetCode;

public class App6 {
	public static void main(String[] args){
		TreeNode tree = new TreeNode(4);
		tree.left = new TreeNode(2);
		tree.left.left = new TreeNode(1);
		tree.left.right = new TreeNode(3);
		tree.right = new TreeNode(6);
		tree.right.left = new TreeNode(5);
		tree.right.right = new TreeNode(7);
		
		invertTree(tree);
	}
	
	public static TreeNode invertTree(TreeNode root) {
		if (root==null)
			return null;
        
		TreeNode temp = new TreeNode(0);
		invertTree(root.left);
		invertTree(root.right);
        temp = root.left;
		root.left = root.right;
		root.right = temp;
		return root;
    }
}
