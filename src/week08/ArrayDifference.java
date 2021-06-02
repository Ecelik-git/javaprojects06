package week08;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayDifference {

	public static void main(String[] args) {
//		Type a program that takes an array and returns 
		//the difference between the biggest and the smallest numbers.
//		 Ask user to enter array elements.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers will you enter? ");
		int quantity = scan.nextInt();
		
		int arr[]= new int[quantity];
		
		for (int i =0; i<quantity; i++) {
			arr[i]=scan.nextInt();
			
		}
		Arrays.sort(arr);
		int difference = arr[arr.length-1]-arr[0];
		System.out.println(difference);
		scan.close();
	}

}
