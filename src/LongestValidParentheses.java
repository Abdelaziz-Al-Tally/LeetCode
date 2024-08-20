import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
https://leetcode.com/problems/longest-valid-parentheses/
Given a string containing just the characters '(' and ')',
return the length of the longest valid (well-formed) parentheses substring
 */
public class LongestValidParentheses {
	public static void main(String[] args) {
		System.out.println(longestValidParentheses("(()"));
		System.out.println(longestValidParentheses(")()())"));
		System.out.println(longestValidParentheses(""));
	}

	public static int longestValidParentheses(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}

		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				stack.push(i);
			} else {
				stack.pop();
				if (stack.isEmpty()) {
					stack.push(i);
				} else {
					maxLength = Math.max(maxLength, i - stack.peek());
				}
			}
		}
		return maxLength;
	}
}
