import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/binary-tree-inorder-traversal/description/
Given the root of a binary tree, return the inorder traversal of its nodes' values
 */
public class BinaryTreeInorderTraversal {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);

		System.out.println(inorderTraversal(root));
	}

	private static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		inorderRecursive(root, result);
		return result;
	}

	private static void inorderRecursive(TreeNode node, List<Integer> result) {
		if (node == null) {
			return;
		}
		inorderRecursive(node.left, result);
		result.add(node.val);
		inorderRecursive(node.right, result);
	}
}
