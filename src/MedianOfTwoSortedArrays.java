/*
https://leetcode.com/problems/median-of-two-sorted-arrays/
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
 */
public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
		System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
	}

	private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length == 0) {
			return medianOfArray(nums2);
		}
		if (nums2.length == 0) {
			return medianOfArray(nums1);
		}
		int n = nums1.length;
		int m = nums2.length;
		int[] mergedArray = new int[n + m];

		int pointer1 = 0;
		int pointer2 = 0;
		int mergedPointer = 0;
		while (pointer1 < nums1.length && pointer2 < nums2.length) {
			if (nums1[pointer1] < nums2[pointer2]) {
				mergedArray[mergedPointer++] = nums1[pointer1++];
			} else {
				mergedArray[mergedPointer++] = nums2[pointer2++];
			}
		}

		while (pointer1 < nums1.length) {
			mergedArray[mergedPointer++] = nums1[pointer1++];
		}
		while (pointer2 < nums2.length) {
			mergedArray[mergedPointer++] = nums2[pointer2++];
		}

		return medianOfArray(mergedArray);
	}
	private static double medianOfArray(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		if (arr.length == 2) {
			return medianOfTwoNumbers(arr[0], arr[1]);
		}
		int middle = arr.length / 2;
		if (arr.length % 2 == 0) {
			return medianOfTwoNumbers(arr[(int)Math.floor(middle) - 1], arr[(int)Math.floor(middle)]);
		}
		return arr[(int)Math.floor(middle)];
	}

	private static double medianOfTwoNumbers(int num1, int num2) {
		return (double) (num1 + num2) / 2;
	}
}
