package com.leetcode.code;

public class Main106 {
	public static void main(String args[]) {
		int[] inorder = {4,2,6,5,7,1,3};
		int[] postorder = {4,6,7,5,2,3,1};
		TreeNode tree = buildTree(inorder,postorder);
		preRead(tree);
		System.out.println();
		inRead(tree);
		System.out.println();
		postRead(tree);
	}
	private static void postRead(TreeNode tree) {
		// TODO Auto-generated method stub
		if(tree == null) {
			return;
		}
		postRead(tree.left);
		postRead(tree.right);
		System.out.print(tree.val + " ");
	}
	private static void inRead(TreeNode tree) {
		// TODO Auto-generated method stub
		if(tree == null) {
			return;
		}
		inRead(tree.left);
		System.out.print(tree.val + " ");
		inRead(tree.right);
	}
	private static void preRead(TreeNode tree) {
		// TODO Auto-generated method stub
		if(tree == null) {
			return;
		}
		System.out.print(tree.val + " ");
		preRead(tree.left);
		preRead(tree.right);
	}
	public static TreeNode buildTree(int[] inorder,int[] postorder) {
		if(inorder == null || inorder.length < 1 || postorder ==null || postorder.length < 1) {
			return null;
		}
		return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
	}
	public static TreeNode helper(int[] inorder,int inFrom,int inTo,int[] postorder,int postFrom,int postTo) {
		if(postFrom > postTo) {
			return null;
		}
		TreeNode tree = new TreeNode(postorder[postTo]);
		if(postFrom == postTo) {
			return tree;
		}
		int index = find(inorder,postorder[postTo]);
		int leftNum = index - inFrom;
		tree.left = helper(inorder,inFrom,index-1,postorder,postFrom,postFrom+leftNum-1);
		tree.right = helper(inorder,index+1,inTo,postorder,postFrom+leftNum,postTo-1);
		return tree;
	}
	public static int find(int[] inorder,int target) {
		for(int i=0; i<inorder.length; i++) {
			if(inorder[i] == target){
				return i;
			}
		}
		return -1;
	}
}
