/*
https://leetcode.com/problems/palindrome-number/
Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));
	}

	private static boolean isPalindrome(int x) {
		// Early exit for negative numbers.
		if (x < 0) {
			return false;
		}
		StringBuilder numberAsString = new StringBuilder(String.valueOf(x));
		StringBuilder reversedAsString = new StringBuilder(numberAsString).reverse();
		return numberAsString.toString().equalsIgnoreCase(reversedAsString.toString());
	}
}
