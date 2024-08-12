/*
https://leetcode.com/problems/length-of-last-word/
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
		System.out.println(lengthOfLastWord("    Fly me to the Moon    "));
	}
	private static int lengthOfLastWord(String s) {
		int length = 0;
		for (int i = s.length() - 1; i >= 0 ; i--) {
			if (s.charAt(i) == ' ') {
				if (length > 0) {
					return length;
				}
				continue;
			}
			length++;
		}
		return length;
	}
}
