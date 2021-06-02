package week06;

import java.util.Arrays;

public class ForEach01 {

	public static void main(String[] args) {
//		Create an array and create a  method to find the number of positive numbers and sum of
//		 the non-positive numbers
//		 Return type must be int array
//		 [a,b]

		int array[]= {2, 6, 1, -9, -7, -2};
		
		System.out.println(Arrays.toString(arrayCheck(array)));
		
	}
	public static int [] arrayCheck(int[] arr) {
		int count = 0;
		int sum =0;
		for(int a : arr) {
			if (a>0) {
				count++;
			}else{
				sum +=a;
			}
		}
		int[] arr1= {0, 0};
		arr1[0]=count;
		arr1[1]=sum;
		return arr1;
	}

}
