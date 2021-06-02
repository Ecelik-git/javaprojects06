package week07;


public class SimpleCalculator {

//	Create a calculator which has three classes
//	 First class should be named as Simple Calculator
//	 create add, subtract, multiply, divide methods in SimpleCalculator Class
//	 Second class should be named as AdvancedCalculator ,
//	 in this class create absoulute method and square root methods
//	 Create a Runner class...
	
	
	public void add(double ...values) {
		int sum =0;
		for(double w: values) {
			sum +=w;
		}
		System.out.println(sum);
	}
	public void subtract(double ...v) {
		double difference =v[0];
		for(int i =1; i<v.length; i++) {
			difference -=v[i];
		}
		System.out.println(difference);	
	}
	public void multiply(double ...v) {
		double multi = 1.0;
		for(double w: v) {
			multi *=w;
		}
		System.out.println(multi);
	}
	public void divide(double ...v) {
		double div = v[0];
		for(int i=1; i<v.length; i++) {
			try {
				div /=v[i];
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
		}
		System.out.println(div);
	}
}

