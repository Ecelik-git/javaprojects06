package weekExtra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiggerThanAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many items will you enter?");
		int numOfElements = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<numOfElements; i++) {
			list.add(scan.nextInt());
		}
		
		biggerThanAve(list);
	}
	public static void biggerThanAve(List<Integer> list){
		int sum = 0;
		int ave;
		for(Integer w: list) {
			sum += w;
		}
		ave=sum/list.size();
		list.stream().filter(t-> t>ave).forEach(t->System.out.print(t+" "));	
		System.out.print("are bigger than "+ave);
	
	}

}
