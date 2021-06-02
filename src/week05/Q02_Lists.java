package week05;

import java.util.ArrayList;
import java.util.List;

public class Q02_Lists {

	public static void main(String[] args) {
//		* Create an integer array with 5 elements
//		 * Convert to a list
//		 * Add 11, and 13 into the list, 11 will be at the beginning, 13 will be at index 3
//		 * Increase the value of every element by 3
//		 * Print the multiplication of the elements from index 2 to index 5
		int arr[]= {2, 3, 4,5, 6};
		List<Integer> list2= new ArrayList<>();
		for(int i = 0; i<arr.length; i++) {
			list2.add(arr[i]);
		}
		list2.add(0, 11);
		list2.add(3, 13);
		for(int j=0; j<list2.size(); j++) {
			list2.set(j, list2.get(j)+3);
		}
		System.out.println(list2);
		int product =1;
		for (int i=2; i<5; i++) {
			product = product*list2.get(i);
		}
		System.out.println(product);
	}

}
