package week07;

public class CalculatorRunner {

	public static void main(String[] args) {
		
		AdvancedCalculator obj = new AdvancedCalculator();
		obj.add(4, 6, 7, 10, 100);
		obj.subtract(9, 5, 1);
		obj.multiply(6, 7, 8);
		obj.divide(6, 3, 0);
		obj.absolute(12.9);
		obj.sqrRoot(-45);
		
		
		//SimpleCalculator obj2 = new SimpleCalculator();
	
	}

}
