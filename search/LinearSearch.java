package dsa;

public class LinearSearch {
	public static void main(String[] args) {
		LinearSearchTestRunner.runAllTests();		
	}

	/**
	 * Performs linear search on the given array.
	 *
	 * @param nums the array to search
	 * @param target the value to find
	 * @return the index of the target if found, otherwise -1
	 *
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static int linearSearch(int[] nums, int target) {
		if(nums == null || nums.length == 0) {
			return -1;
		}

		for (int i = 0; i < nums.length; i++) {
			if(target == nums[i]) {
				return i;
			}
		}

		return -1;
	}
}

class LinearSearchTestRunner {
	public static void runAllTests() {
		runTest("1.Element Present in middle", new int[] {3,2,5,9,6,1}, 9, 3);
		runTest("2.Element Present at first position", new int[] {3,2,5,9,6,1}, 3, 0);
		runTest("3.Element Present at last position", new int[] {10, 20, 30, 40}, 40, 3);
		runTest("4.Element not present", new int[] {3,2,5,9,6,1}, 7, -1);
		runTest("5.Empty array", new int[] {}, 5, -1);
		runTest("6.Single element found", new int[] {7}, 7, 0);
		runTest("7.Single element not found", new int[] {7}, 3, -1);
		runTest("8.Duplicate Elements return first occurrence", new int[] {3,2,5,2,6,1}, 2, 1);
		runTest("9.Mixed positive and negative", new int[] {-3,2,-5,6,-6,1}, -6, 4);
		runTest("10.Negative number", new int[] {-3,-2,-5,-6,-6,-1}, -5, 2);
		runTest("11.All same elements", new int[] {2,2,2,2}, 2, 0);
		runTest("12.Large numbers", new int[]{100000, 200000, 300000}, 300000, 2);
		runTest("13.Null array", null, 7, -1);
	}

	private static void runTest(String testName, int[] nums, int target, int expected) {
		int actual = LinearSearch.linearSearch(nums, target);

		if(actual == expected) {
			System.out.println("[PASS] " + testName +
					" | expected=" + expected +
					" | actual=" + actual);
		} else {
			System.out.println("[FAIL] " + testName +
					" | expected=" + expected +
					" | actual=" + actual);
		}

	}
}
