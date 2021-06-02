package week09;

public class Runner {
	/*
	  Positive Scenario:
	 	User should be able to buy a single product
	 	User should be able to buy multipl products
	  Negative Scenario:
	  	User should be able to buy if the balance isn't enough(add/no add)
	  	After buying sth, if the remaining balance isn't enough, user should be able to buy(add/not add)
	 */

	public static void main(String[] args) {
		
		Products product = new Products();
		Methods method = new Methods();
		
		System.out.println("Hello, welcome to ABC!");
		
		double accountBalance = 10;
		
		accountBalance = method.getMoney(accountBalance);
		product.setPrice(method.select(product));
		accountBalance = method.balance(product.getPrice(), accountBalance, product);
		method.purchase(product.getPrice(), accountBalance, product);
		
		

	}

}
