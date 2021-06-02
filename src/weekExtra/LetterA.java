package weekExtra;

import java.util.ArrayList;
import java.util.List;

public class LetterA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
        
        LetterA(list);

	}
	public static List<String> LetterA(List<String> list){
		List<String> l = new ArrayList<>();
		list.stream().filter(t->t.charAt(0)=='a' && t.length()==3).forEach(t->l.add(t));
		return l;
	
	}

}
