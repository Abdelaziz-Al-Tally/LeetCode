/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
Given an integer array nums sorted in non-decreasing order,
remove some duplicates in-place such that each unique element appears at most twice.
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages,
you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates,
then the first k elements of nums should hold the final result.
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array.
You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArrayTwo {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
	}

	private static int removeDuplicates(int[] nums) {
		if (nums.length <= 2) {
			return nums.length;
		}

		int lastFilledIndex = 2;
		for (int read = 2; read < nums.length; read++) {
			if (nums[read] != nums[lastFilledIndex - 2]) {
				nums[lastFilledIndex] = nums[read];
				lastFilledIndex++;
			}
		}

		return lastFilledIndex;
	}
}
