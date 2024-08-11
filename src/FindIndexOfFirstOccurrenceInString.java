package Pushed;

/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class FindIndexOfFirstOccurrenceInString {
	public static void main(String[] args) {
		System.out.println(strStr("sadbutsad", "sad"));
		System.out.println(strStr("leetcode", "leeto"));

		System.out.println(strStr2("sadbutsad", "sad"));
		System.out.println(strStr2("leetcode", "leeto"));
	}


	/**
	 * Using the built-in method `indexOf`
	 */
	private static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}

	/**
	 * Manual Implementation of String.indexOf
	 */
	private static int strStr2(String haystack, String needle) {
		int hayStackLength = haystack.length();
		int needleLength = needle.length();

		for (int i = 0; i <= hayStackLength - needleLength; i++) {
			int j = 0;
			for (; j < needleLength; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == needleLength) {
				return i;
			}
		}
		return -1;
	}
}
