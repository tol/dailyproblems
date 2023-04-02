package ro.tol;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 * Example 2:
 *
 * Input: n = 1, bad = 1
 * Output: 1
 */
public class MyFirstBadVersion {

	boolean[] mbd= new boolean[]{false,false,false,true,true};
	//boolean[] mbd= new boolean[]{false,true};
	public boolean isBadVersion(int x){
		return mbd[x];
	}

	public int firstBadVersion(int n) {
		int mid=n/2;
		int low=1;
		int end=n;

		if (n==1) return 1;
		while (low < end ) {
			boolean midBad = isBadVersion(mid);
			if (mid > 0 && midBad && !isBadVersion(mid - 1)) {
				return mid;
			}
			if (mid==0){
				return 1;
			}
			if (midBad) {
				end = mid;
			}
			if (!midBad) {
				low=mid+1;
			}
			mid=low+(end-low)/2;

		}

		return mid;
	}

	public static  void main(String [] args){

		System.out.println(new MyFirstBadVersion().firstBadVersion(5));
	}
}
