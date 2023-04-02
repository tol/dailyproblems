package ro.tol;

public class RGB {
	/**
	 * Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.
	 *
	 * Do this in linear time and in-place.
	 *
	 * For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].
	 * @param flag
	 * @return
	 */

	public void swap(Character a,Character b ){
		char temp;
		temp=a;
		a=b;
		b=temp;
	}
	public char[]  resolve(char[] flag){
		int low=0;
		int mid=0;
		int high= flag.length-1;

		while (mid <=high){
			if (flag[mid]=='R'){
				//swap(flag[low],flag[mid]);
				char temp=flag[low];
				flag[low]=flag[mid];
				flag[mid]=temp;
				low++;
				mid++;
			}else {
				if (flag[mid] == 'G') {

					mid++;
				} else{
					//swap(flag[high],flag[mid]);
					char temp=flag[high];
					flag[high]=flag[mid];
					flag[mid]=temp;
					high--;

				}
			}
		}
		return flag;
	}
}
