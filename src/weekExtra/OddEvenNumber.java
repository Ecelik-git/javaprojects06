package weekExtra;

import java.util.ArrayList;
import java.util.List;

public class OddEvenNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(44);
		list.add(45);
		list.add(56);
        
        numberToString(list);

	}
	public static void numberToString(List<Integer> list){
		List<String> l = new ArrayList<>();
		list.stream().filter(t->t%2==0).forEach(t->l.add("e"+t));
		list.stream().filter(t->t%2!=0).forEach(t->l.add("o"+t));
		System.out.println(l);
		
	
	}
}
