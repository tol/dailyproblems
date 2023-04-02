package ro.tol;

/**
 * Given a binary string S consisting of 0s and 1s. The task is to find the maximum difference of the number of 0s and the number of 1s (number of 0s – number of 1s) in the substrings of a string.
 *teams
 * Note: In the case of all 1s, the answer will be -1.
 *
 * Example 1:
 *
 * Input : S = "11000010001"
 * Output : 6
 * Explanatio: From index 2 to index 9,
 * there are 7 0s and 1 1s, so number
 * of 0s - number of 1s is 6.
 * Example 2:
 *
 * Input: S = "111111"
 * Output: -1
 * Explanation: S contains 1s only
 *
 * https://www.geeksforgeeks.org/maximum-difference-zeros-ones-binary-string-set-2-time/
 * https://medium.com/@rsinghal757/kadanes-algorithm-dynamic-programming-how-and-why-does-it-work-3fd8849ed73d
 *
 */
public class MaxZerosKadane {

	/**
	 *   /**
	 *      * Initialize:
	 *     max_so_far = INT_MIN
	 *     max_ending_here = 0
	 *
	 * Loop for each element of the array
	 *   (a) max_ending_here = max_ending_here + a[i]
	 *   (b) if(max_so_far < max_ending_here)
	 *             max_so_far = max_ending_here
	 *   (c) if(max_ending_here < 0)
	 *             max_ending_here = 0
	 * return max_so_far
	 *      *
	 *      **/

	int maxSubstring(String S) {
		int current_sum = 0;
		int max_sum = 0;

		for (int i=0;i<S.length();i++){
			current_sum += (S.charAt(i) == '0' ? 1 : -1);

			if (current_sum < 0)
				current_sum = 0;

			// update maximum sum
			max_sum = Math.max(current_sum, max_sum);


		}
		return max_sum == 0 ? -1 : max_sum;

	}

	public static void main(String[] args){
		System.out.println(new MaxZerosKadane().maxSubstring("11000010001"));
	}
}
