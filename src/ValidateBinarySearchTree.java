/*
https://leetcode.com/problems/validate-binary-search-tree/submissions/1352119701/
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:
- The left "subtree" of a node contains only nodes with keys less than the node's key.
- The right "subtree" of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) {
			this.val = val;
		}
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {

	}

	private static boolean isValidBST(TreeNode root) {
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private static boolean isValidBST(TreeNode node, long min, long max) {
		if (node == null) {
			return true;
		}
		// Check if the current node's value is within the valid range
		if (node.val <= min || node.val >= max) {
			return false;
		}
		// Recursively check the left subtree and right subtree
		return isValidBST(node.left, min, node.val) &&
				isValidBST(node.right, node.val, max);
	}
}
