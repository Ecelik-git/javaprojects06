package week06;

public class ArrayMethod {

	public static void main(String[] args) {
//		write a method that accepts an array and prints true if the sum of all 3's in
//        * the array is exactly 9
//        *
//        * Input : {2,3,5,3,6,3,7} output :true
//        * Input : {2,3,4,5,6,3,7} output :false
		
		int[] arr = {2,3,5,3,6,3,7};
		int[] arr1 = {2,3,4,5,6,3,7};
		
		System.out.println(arrayCheck(arr));
		System.out.println(arrayCheck(arr1));
		
	}

	public static boolean arrayCheck(int[] arr) {
		int count = 0;
		for(int w:arr) {
			if(w==3) {
				count++;
			}
		}
		return count==3;
	}
}
