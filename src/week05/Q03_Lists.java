package week05;

public class Q03_Lists {

	public static void main(String[] args) {
//		Type a program that can add the even numbers in the array
//        * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
//        * OUTPUT : The sum of even numbers is  : 26
		int brr[][]= {{1,3,6},{2,8},{5,7,9,14}};
		addEvenNumbers(brr);
		

	}
	public static void addEvenNumbers(int arr[][]) {
		int evenSum = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%2==0) {
					evenSum += arr[i][j];
				}
			}
		}
		System.out.println(evenSum);
	}

}
