import java.util.Arrays;
/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
 */
public class FirstAndLastPositionOfElementInSortedArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
		System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
	}

	private static int[] searchRange(int[] nums, int target) {
		int[] result = new int[]{-1, -1};
		if (nums == null || nums.length == 0) {
			return result;
		}

		result[0] = findFirstOccurrence(nums, target);
		if (result[0] == -1) {
			return result;
		}
		result[1] = findLastOccurrence(nums, target);
		return result;
	}

	private static int findFirstOccurrence(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int firstPosition = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				firstPosition = mid;
				right = mid - 1;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return firstPosition;
	}

	private static int findLastOccurrence(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int lastPosition = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				lastPosition = mid;
				left = mid + 1;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return lastPosition;
	}
}
