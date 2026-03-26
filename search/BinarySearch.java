package dsa;

public class BinarySearch {
	public static void main(String[] args) {
		BinarySearchTestRunner.runAllTests();		
	}

	/**
	 * Performs binary search on the given sorted array.
	 *
	 * @param nums the array to search
	 * @param target the value to find
	 * @return the index of the target if found, otherwise -1
	 *
	 * Time Complexity: O(log n)
	 * Space Complexity: O(1)
	 */
	public static int binarySearch(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}

		int left = 0;
		int right = nums.length - 1;


		while (left <= right) {

			// find mid index : Integer Overflow
			//int mid = (left + right) / 2;
			int mid = left + (right - left) / 2; 

			//check at mid index
			if (nums[mid] == target) {
				return mid;
			}

			//update left and right
			if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}


		return -1;
	}
}

class BinarySearchTestRunner {
	public static void runAllTests() {

		//1. Null and empty input
		runTest("Null array", null, 5, -1);
		runTest("Empty array", new int[] {}, 5, -1);

		//2. Single-element array
		runTest("Single element found", new int[] {7}, 7, 0);
		runTest("Single element not found", new int[] {9}, 7, -1);

		//3. Target at common positions
		runTest("Target in the middle", new int[] {1, 2, 3, 4, 5}, 3, 2);
		runTest("Target at first position", new int[] {1, 2, 3, 4, 5}, 1, 0);
		runTest("Target at last position", new int[] {1, 2, 3, 4, 5}, 5, 4);

		//4. Target absent
		runTest("Target not present", new int[] {1, 2, 3, 4, 5}, 6, -1);
		runTest("Target smaller than all elements", new int[] {2, 3, 4, 5, 6, 7}, 0, -1);
		runTest("Target larger than all the elements", new int[] {1, 2, 3, 4, 5}, 7, -1);
		
		//5. Two-element arrays
		runTest("Two elements target first", new int[] {2, 8}, 2, 0);
		runTest("Two elements target last", new int[] {2, 8}, 8, 1);
		runTest("Two elements target absent", new int[] {2, 8}, 7, -1);
		
		//6. Odd and even length arrays
		runTest("Odd length array", new int[] {1, 2, 3, 4, 5}, 4, 3);
		runTest("Even length array", new int[] {1, 2, 3, 4, 5, 6}, 4, 3);
		
		//7. Negative numbers
		runTest("Negative numbers only", new int[] {-9, -7, -5, -3, -1}, -5, 2);
		runTest("Mixed negative and positive", new int[] {-9, -7, 0, 3, 9}, -7, 1);
		runTest("Target is zero", new int[] {-9, -7, 0, 3, 9}, 0, 2);
		
		//8. Duplicates
		runDuplicateTest("Duplicates present", new int[] {1, 2, 2, 2, 5, 7}, 2);
		runDuplicateTest("All same elements and target present", new int[] {2, 2, 2, 2, 2, 2}, 2);
		runTest("All same elements and target not present", new int[] {1, 1, 1, 1, 1, 1}, 2, -1);
		
		//9. Large values
		runTest("Large numbers", new int[] {100000, 200000, 300000, 500000}, 300000, 2);
		runTest("Integer boundary style values", new int[] {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE}, Integer.MAX_VALUE, 4);
		runTest("Integer MIN_VALUE", new int[] {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE}, Integer.MIN_VALUE, 0);

	}

	private static void runTest(String testName, int[] nums, int target, int expected) {
		int actual = BinarySearch.binarySearch(nums, target);

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
	
	private static void runDuplicateTest(String testName, int[] nums, int target) {
		int actual = BinarySearch.binarySearch(nums, target);
		
		boolean pass = actual >= 0 && actual < nums.length && (nums[actual] == target);

		if (pass) {
			System.out.println("[PASS] " + testName +
					" | returned valid index=" + actual);
		} else {
			System.out.println("[FAIL] " + testName +
					" | returned invalid index=" + actual);
		}
	}
}
