package ro.tol;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsPlayground {

	public static void main(String [] args  ){
		extracted();
		List<Integer> myList =
			Arrays.asList(1, 2, 3, 4);
		Integer[] arr=new Integer[] {1,2,3};
		List<Integer> myList1 =Arrays.asList(arr);


		Integer s=myList
			.stream()
			.map(x->x*x)
			.reduce(0,(x,a)->x+a);
		System.out.println(s);
		List<Integer> s1=myList
			.stream()
			.filter(x->x>3)
			.collect(toList());

		System.out.println(s1);
	}

	public static List<String> extracted() {
		List<String> myList =
			Arrays.asList("a1", "a2", "b1", "c2", "c1");

		return myList
			.stream()
			.filter(s -> s.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.collect(toList());
	}
}
