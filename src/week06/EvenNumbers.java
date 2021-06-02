package week06;

public class EvenNumbers {

	public static void main(String[] args) {
//		Type a program that can find the number of even digits number elements in array
//		 for array :  int nums[] = {12, 6, 123, 3214}; (numbers should be positive)
//		 OUTPUT : There are 2 even digits numbers in the array
		
		int nums[] = {12, 6, 123, 3214};
		int count =0;
		for(int w : nums) {
			if(w>0) {
				if(String.valueOf(w).length()%2==0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
