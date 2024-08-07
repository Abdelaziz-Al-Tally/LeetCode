import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
Given a string s, find the length of the longest substring without repeating characters
 */
public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	private static int lengthOfLongestSubstring(String word) {
		if (word == null || word.length() == 0) {
			return 0;
		}
		int longest = 1;
		int counter = 1;
		Map<Character, Integer> myMap = new HashMap<>();
		myMap.put(word.charAt(0), 0);

		for (int i = 1; i < word.length(); i++) {
			if (!myMap.containsKey(word.charAt(i))) {
				myMap.put(word.charAt(i), i);
				counter++;
				if (counter > longest) {
					longest = counter;
				}
			} else {
				if (counter > longest) {
					longest = counter;
				}
				counter = 0;
				i = myMap.get(word.charAt(i));
				myMap.clear();
			}
		}
		return longest;
	}
}
