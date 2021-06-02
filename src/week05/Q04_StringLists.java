package week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q04_StringLists {

	public static void main(String[] args) {
//		Type a program that can create random username
//		 *  1.  Step : Create a database (Create a String list and add five names)
//		 *  2. Step : Ask user their name
//		 *  3. Step : Remove spaces
//		 *  4. Step : Check if username is valid
//		 *  5. Step : If username is not in our list user can use that username
//		 *  6. Step : If username is in our list add random number at the end of the username
		
		List<String> str = new ArrayList<>();
		Random random = new Random();
		int number = random.nextInt(1001);
		str.add("David");
		str.add("Yusuf");
		str.add("Mustafa");
		str.add("Yusa");
		str.add("Enes");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scan.nextLine().trim();
		name = name.replaceAll(" ", "");
		if(str.contains(name)) {
			String name1 = name +number;
			System.out.println("You can use "+name+" as "+name1);
		}else {
			System.out.println("You can use "+name+" as you entered as a username");
		}
		scan.close();
	}

}
