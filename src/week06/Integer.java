package week06;


import java.util.Arrays;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
//		Ask user to enter an integer, and create a squared multi dimesional Array
//		Example: If user enters 3 ==> [[3, 3, 3],
//									   [3, 3, 3],
//	  								   [3, 3, 3]]
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int[][] arr = new int[num][num];
		for(int i =0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr[i][j]=num;
			}
			
		}
		System.out.println(Arrays.deepToString(arr));
		scan.close();

	}

}
