/*
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
Given an integer array nums where the elements are sorted in ascending order,
convert it to a height-balanced binary search tree
 */
public class ConvertSortedArrayToBinarySearchTree {
	public static void main(String[] args) { }

	private static TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null) {
			return null;
		}
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}

	private static TreeNode sortedArrayToBST(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}

		int mid = (left + right) / 2;
		TreeNode root = new TreeNode(nums[mid]);

		root.left = sortedArrayToBST(nums, left, mid - 1);
		root.right = sortedArrayToBST(nums, mid + 1, right);

		return root;
	}
}
