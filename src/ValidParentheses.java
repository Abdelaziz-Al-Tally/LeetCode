import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/description/
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

 */
public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}
	private static boolean isValid(String s) {
		Map<Character, Character> parenthesis = new HashMap<>();
		parenthesis.put(')', '(');
		parenthesis.put('}', '{');
		parenthesis.put(']', '[');

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			// Opening Parenthesis
			if (!parenthesis.containsKey(current)) {
				stack.push(current);
			} else {
				if(stack.isEmpty()) {
					return false;
				}
				// Closing Parenthesis
				char top = stack.peek();
				if (parenthesis.get(current) != top) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
