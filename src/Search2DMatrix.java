/*
https://leetcode.com/problems/search-a-2d-matrix/

You are given an m x n integer matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
 */
public class Search2DMatrix {
	public static void main(String[] args) {}

	private static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix[0][0] == target) {
			return true;
		}

		int row = goDownUntilLessThan(matrix, target);
		if (row >= matrix.length) {
			return false;
		}
		int col = goRightUntilLessThan(matrix, row, 0, target);
		return matrix[row][col] == target;
	}

	private static int goDownUntilLessThan(int[][] matrix, int target) {
		int i = 0;
		for (;i < matrix.length - 1; i++) {
			if (matrix[i + 1][0] > target) {
				break;
			}
		}
		return i;
	}

	private static int goRightUntilLessThan(int[][] matrix, int currentRow, int currentCol, int target) {
		int i = currentCol;
		for (;i < matrix[currentRow].length - 1; i++) {
			if (matrix[currentRow][i + 1] > target) {
				break;
			}
		}
		return i;
	}
}
