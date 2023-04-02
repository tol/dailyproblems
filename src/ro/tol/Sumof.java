package ro.tol;

import java.util.HashMap;

import com.apple.eawt.AppEvent;

public class Sumof {



		static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
			// code here
			HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
			for(int i=0; i<arr.length;i++){
				map.put(arr[i],arr[i]);
			}
			for(int i=0; i<arr.length;i++){
				if (map.get(x-arr[i])!=null) return true;

			}
			return false;
		}

		public static  void main(String[] args){
			int [] arr={1,2,5,6,7};
			System.out.println(hasArrayTwoCandidates(arr,5,4));
		}
}
