package ro.tol;

public class BinarySearch {

		public int search(int[] nums, int target) {
			int mid=nums.length/2;
			int low=0;
			int end=nums.length;
			while (low<end-1){
				if (nums[mid] ==target){
					return mid;
				}
				if (nums[mid] > target){
					end=mid;
				}
				if (nums[mid]< target){
					low=mid;
				}
				mid=low+(end-low)/2;

			}
			return -1;
		}

	/**
	 * [-1,0,3,5,9,12]
	 * 9
	 * [-1,0,3,5,9,12]
	 * 2
	 * @param args
	 */
	public static  void main(String ... args){
			int a[]=new int[]{-1,0,3,5,9,12};
			System.out.println(new BinarySearch().search(a,2));
	}
}
