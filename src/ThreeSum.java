import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/3sum-closest/
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
 */
public class ThreeSum {
	public static void main(String[] args) {
		System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
	}
	private static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums == null || nums.length < 3) {
			return result;
		}

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int lPointer = i + 1;
			int rPointer = nums.length - 1;

			while (lPointer < rPointer) {
				int sum = nums[i] + nums[lPointer] + nums[rPointer];
				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[lPointer], nums[rPointer]));
					while (lPointer < rPointer && nums[lPointer] == nums[lPointer + 1]) {
						lPointer++;
					}
					while (lPointer < rPointer && nums[rPointer] == nums[rPointer - 1]) {
						rPointer--;
					}
					lPointer++;
					rPointer--;
				} else if (sum < 0) {
					lPointer++;
				} else {
					rPointer--;
				}
			}
		}

		return result;
	}
}
