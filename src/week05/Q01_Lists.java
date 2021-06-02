package week05;

import java.util.ArrayList;
import java.util.List;

public class Q01_Lists {

	public static void main(String[] args) {
		//* Create an integer list which has 5 elements
		 //* Update all elements by adding "*" on the right of every element
		List<Integer> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add(3);
		list1.add(12);
		list1.add(24);
		list1.add(48);
		list1.add(5);
		for (int i = 0; i<list1.size(); i++) {
			list2.add(list1.get(i)+"*");
			
		}
		System.out.println(list2);

	}

}
