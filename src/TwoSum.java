import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] result1 = twoSum(new int[]{2,7,11,15}, 9);
		int[] result2 = twoSum(new int[]{3,2,4}, 6);
		int[] result3 = twoSum(new int[]{3, 3}, 6);
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int index = 0; index <= nums.length; index++) {
			int number = nums[index];
			int compliment = target - number;
			if (map.containsKey(compliment)) {
				return new int[]{index, map.get(compliment)};
			} else {
				map.put(number, index);
			}
		}
		return new int[]{0, 0};
	}
}
