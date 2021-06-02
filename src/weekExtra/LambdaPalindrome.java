package weekExtra;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LambdaPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();
		
		System.out.println(isPalindrome(num));

	}
	public static boolean isPalindrome(int number) {
		 return number == IntStream.iterate(number, i -> i / 10)
			        .map(n -> n % 10)
			        .limit(String.valueOf(number).length())
			        .reduce(0, (a, b) -> a = a * 10 + b);
	}

}
