package com.leetcode.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main94 {
	public static void main(String args[]) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t1.right = t2;
		t2.left = t3;
		System.out.println(inorderTraversal(t1));
	}
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if(root == null) return res;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(!stack.isEmpty() || root!=null) {
			if(root != null) {
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
				res.add(root.val);
				root = root.right;
			}
		}
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/** 
	 * @Description 递归解法，辣鸡！ 
	 * @author hlz
	 * @param root
	 * @return  
	 */
	  	
	public static List<Integer> inorderTraversal1(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		inorder(root,res);
		return res;
	}
	public static void inorder(TreeNode root,List<Integer> res) {
		if(root == null) return;
		inorder(root.left,res);
		res.add(root.val);
		inorder(root.right,res);
	}
}
