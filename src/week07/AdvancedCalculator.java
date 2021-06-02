package week07;

public class AdvancedCalculator extends SimpleCalculator {


	public void absolute(double a) {
		System.out.println("The absolute value is "+Math.abs(a));
	}
	
	public void sqrRoot(double num) {
		try {
			System.out.println("The square root is "+Math.sqrt(num));
		}catch(ArithmeticException e) {
			e.getStackTrace();
		}
	}
}