package week07;

public class Runner {

	public static void main(String[] args) {
		Printer printer = new Printer(80, true);
		System.out.println("The toner level is "+printer.addToner(30));
		
		System.out.println("the number of papers that you need is "+printer.printPage(11));
		printer.getPagesPrinted();

	}

}
