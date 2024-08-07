/*
https://leetcode.com/problems/reverse-integer/
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(120));
	}

	private static int reverse(int x) {
		if (x == 0) {
			return x;
		}

		// Handle Negative Values
		int sign = x < 0 ? -1 : 1;
		x = Math.abs(x);

		int reversed = 0;
		while(x != 0) {
			int pop = x % 10;
			x /= 10;
			if (reversed > (Integer.MAX_VALUE - pop) / 10) {
				return 0;
			}
			reversed = reversed * 10 + pop;
		}
		return sign * reversed;
	}
}
