/*
https://leetcode.com/problems/longest-common-prefix/
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"flower","flower","flower","flower"}));
	}

	private static String longestCommonPrefix(String[] strings) {
		if (strings == null || strings.length == 0 || strings[0].isEmpty()) {
			return "";
		}
		if (strings.length == 1) {
			return strings[0];
		}
		int minLength = Integer.MAX_VALUE;
		for (String str : strings) {
			if (str.isEmpty()) {
				return "";
			}
			minLength = Math.min(minLength, str.length());
		}

		StringBuilder common = new StringBuilder();
		for (int i = 0; i < minLength; i++) {
			char current = strings[0].charAt(i);
			for (int j = 1; j < strings.length; j++) {
				if (i >= strings[j].length() || strings[j].charAt(i) != current) {
					return common.toString();
				}
			}
			common.append(current);
		}
		return common.toString();
	}
}
