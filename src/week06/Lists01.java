package week06;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
//		Question: Type the codes which has 2 list of elements.
//		 * The first list has "John, running, to ", and the
//		 * 2nd list has "John, will, to, home".
//		 * It completes the  missing words for each list and complete the sentences
//		 *  like:
//		  "John is running to School. John will come back to home" as one list.
//		    Remove the ,'s.
//		 *  Then delete all the elements in the list.
		
		List<String> str1 = new ArrayList<>();
		
		str1.add("John");
		str1.add("running");
		str1.add("to");
		List<String> str2 = new ArrayList<>();
		str2.add("John");
		str2.add("will");
		str2.add("to");
		str2.add("home");
		
		str1.add(1, "is");
		str2.add(2, "come");
		str2.add(3, "back");
		str1.add(str1.size()-1, "school");
		str1.addAll(str2);
		System.out.println(str1);
		System.out.println(str2);
		for(String w: str1) {
			System.out.print(w+" ");
		}
		
		
		
		
		
		

	}

}
