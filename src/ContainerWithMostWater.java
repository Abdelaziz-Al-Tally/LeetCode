import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/container-with-most-water/
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
 */
public class ContainerWithMostWater {
	public static void main(String[] args) {
		System.out.println(maxArea(new int[]{1, 1}));
	}

	private static int maxArea(int[] height) {
		if (height == null || height.length == 1) {
			return 0;
		}
		int lPointer = 0;
		int rPointer = height.length - 1;
		int largestArea = 0;
		while (lPointer < rPointer) {
			int currentArea = calculateSpace(
					Math.min(height[lPointer], height[rPointer]),
					rPointer - lPointer
			);
			if (currentArea > largestArea) {
				largestArea = currentArea;
			}

			// Move the lower pointer
			if (height[lPointer] < height[rPointer]) {
				lPointer++;
			} else {
				rPointer--;
			}
		}
		return largestArea;
	}

	private static int calculateSpace(int height, int width) {
		return height * width;
	}
}
