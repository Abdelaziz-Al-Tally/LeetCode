/*
https://leetcode.com/problems/sort-colors/
Given an array nums with n objects colored red, white, or blue,
sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
 */
public class SortColors {
	public static void main(String[] args) {
		sortColors(new int[]{2,0,2,1,1,0});
	}

	private static void sortColors(int[] nums) {
		int[] frequency = new int[3];
		for (int num: nums) {
			frequency[num]++;
		}

		int index = 0;
		for (int i = 0; i < frequency.length; i++) {
			while(frequency[i] > 0) {
				nums[index] = i;
				index++;
				frequency[i]--;
			}
		}
	}
}
