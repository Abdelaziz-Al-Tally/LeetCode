import java.util.HashMap;
import java.util.Map;
/*
https://leetcode.com/problems/valid-sudoku/description/
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Note:
A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules
 */
public class ValidSudoku {
	public static void main(String[] args) {}
	private static boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			// Check on the row.
			if (!checkRowOrColumn(board[i])) {
				System.out.println("row" + i + "has something wrong");
				return false;
			}

			// build and check the column.
			char[] column = buildColumn(board, i);
			if (!checkRowOrColumn(column)) {
				System.out.println("col" + i + "has something wrong");
				return false;
			}
		}

		char[][][] boxes = new char[3][3][3];
		boxes[0] = new char[3][3];
		boxes[1] = new char[3][3];
		boxes[2] = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				int boxPos = j / 3;
				boxes[boxPos][i % 3][j % 3] = board[i][j];
			}
			if ((i + 1) % 3 == 0) {
				for (char[][] subBoard: boxes) {
					if (!checkSubBoard(subBoard)) {
						return false;
					}
				}
				boxes[0] = new char[3][3];
				boxes[1] = new char[3][3];
				boxes[2] = new char[3][3];
			}
		}

		return true;
	}

	private static char[] buildColumn(char[][] board, int columnNumber) {
		char[] column = new char[board[columnNumber].length];
		for (int i = 0; i < board[columnNumber].length; i++) {
			column[i] = board[i][columnNumber];
		}
		return column;
	}

	private static boolean checkRowOrColumn(char[] row) {
		Map<Character, Boolean> numberMap = new HashMap<>();
		for (char c : row) {
			if (c != '.' && numberMap.containsKey(c)) {
				return false;
			}
			numberMap.put(c, true);
		}
		return true;
	}

	private static boolean checkSubBoard(char[][] subBoard) {
		Map<Character, Boolean> numberMap = new HashMap<>();
		for(char[] row: subBoard) {
			for (char c: row) {
				if (c != '.' && numberMap.containsKey(c)) {
					return false;
				}
				numberMap.put(c, true);
			}
		}
		return true;
	}
}
