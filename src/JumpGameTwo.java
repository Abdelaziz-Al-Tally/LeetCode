/*
https://leetcode.com/problems/jump-game-ii/
You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i.
In other words, if you are at nums[i], you can jump to any nums[i + j] where:

Constraints:
- 0 <= j <= nums[i]
- i + j < n

Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 */
public class JumpGameTwo {
	public static void main(String[] args) {
		System.out.println(jump(new int[]{2, 1}));
	}

	public static int jump(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int jumpCount = 0;
		int currentEnd = 0;
		int farthest = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			farthest = Math.max(farthest, nums[i] + i);

			if (i == currentEnd) {
				jumpCount++;
				currentEnd = farthest;

				if (currentEnd >= nums.length - 1) {
					break;
				}
			}
		}
		return jumpCount;
	}
}
