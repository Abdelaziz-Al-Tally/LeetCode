/*
https://leetcode.com/problems/longest-palindromic-substring/
Given a string s, return the longest palindromic substring in s.
 */
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
		System.out.println(longestPalindrome("cbbd"));
	}

	private static String longestPalindrome(String s) {
		if (s == null || s.isEmpty()) {
			return "";
		}

		String longest = "";
		for (int i = 0; i < s.length(); i++) {
			String oddPalindrome = expandFromCenter(s, i, i);
			String evenPalindrome = expandFromCenter(s, i, i + 1);

			if (oddPalindrome.length() > longest.length()) {
				longest = oddPalindrome;
			}
			if (evenPalindrome.length() > longest.length()) {
				longest = evenPalindrome;
			}
		}
		return longest;
	}

	private static String expandFromCenter(String s, int leftPointer, int rightPointer) {
		while (leftPointer >= 0 && rightPointer < s.length() && s.charAt(leftPointer) == s.charAt(rightPointer)) {
			leftPointer--;
			rightPointer++;
		}
		return s.substring(leftPointer + 1, rightPointer);
	}
}
