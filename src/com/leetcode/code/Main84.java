package com.leetcode.code;

public class Main84 {
	public static void main(String args[]) {
		int[] preorder = {1,2};
		int[] inorder = {2,1};
		TreeNode tree = buildTree(preorder,inorder);
		preRead(tree);
		System.out.println();
		inRead(tree);
		System.out.println();
		aftRead(tree);
		
	}
	public static TreeNode buildTree(int[] preorder,int[] inorder) {
		if(preorder == null || inorder == null || preorder.length < 1 || inorder.length < 1)
			return null;
		return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
	}
	public static TreeNode helper(int[] preorder,int preFrom,int preTo,int[] inorder,int inFrom,int inTo) {
		if(preFrom > preTo) {
			return null;
		}
		TreeNode tree = new TreeNode(preorder[preFrom]);
		if(preFrom == preTo) {
			return tree;
		}
		
		int index = find(preorder,preFrom,inorder);
		int leftNum = index - inFrom;
		tree.left = helper(preorder,preFrom+1,preFrom+leftNum,inorder,inFrom,index-1);
		tree.right = helper(preorder,preFrom+leftNum+1,preTo,inorder,index+1,inTo);
		return tree;
	}
	public static int find(int[] preorder,int preFrom,int[] inorder) {
		for(int i=0; i<inorder.length; i++) {
			if(inorder[i] == preorder[preFrom]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void preRead(TreeNode tree) {
		if(tree == null) {
			return;
		}
		System.out.print(tree.val + " ");
		preRead(tree.left);
		preRead(tree.right);
	}
	public static void inRead(TreeNode tree) {
		if(tree == null) {
			return;
		}
		inRead(tree.left);
		System.out.print(tree.val + " ");
		inRead(tree.right);
	}
	public static void aftRead(TreeNode tree) {
		if(tree == null) {
			return;
		}
		aftRead(tree.left);
		aftRead(tree.right);
		System.out.print(tree.val + " ");
	}
}
