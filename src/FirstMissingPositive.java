import java.util.HashMap;
import java.util.Map;
/*
https://leetcode.com/problems/first-missing-positive/
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 */

public class FirstMissingPositive {
	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
		System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
		System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
	}

	private static int firstMissingPositive(int[] nums) {
		Map<Integer, Boolean> numbersMap = new HashMap<>();

		for (int number: nums) {
			if (number > 0) {
				numbersMap.put(number, true);
			}
		}

		int currentNumber = 1;
		while (true) {
			if (!numbersMap.containsKey(currentNumber)) {
				return currentNumber;
			}
			currentNumber++;
		}
	}
}
