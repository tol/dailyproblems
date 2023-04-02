package ro.tol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {
	public static void checkMagazine(List<String> magazine, List<String> note) {

		HashMap<String,Integer> letters =new HashMap<String,Integer>();
		for (String word:magazine ){

			Integer lcount=letters.getOrDefault(word,0);
			letters.put(word,++lcount);

		}

		for (String word:note ){

			Integer lcount= letters.getOrDefault(word,0);
			if (lcount.intValue()==0){
				System.out.println("No");
				return;
			}
			letters.put(word,lcount--);

		}
		System.out.println("Yes");

	}


	public static  void main(String [] args ){
		List<String> magazine =new ArrayList<>();
		magazine.add("one");
		//magazine.add("note");

		List<String> note =new ArrayList<>();
		note.add("one");
		note.add("note");
		checkMagazine(magazine,note);
	}

}
