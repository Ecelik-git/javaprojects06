package week07;

public class Printer {
	// Create a class and demonstrate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a dublex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	
	
	public Printer(int tonerLevel, boolean duplex) {
		this.tonerLevel = tonerLevel;
		this.duplex = duplex;
		//this.pagesPrinted = 0;
	}

	public int addToner(int tonerAmount) {
		if(tonerLevel >0 && tonerLevel<=100) {
			if(this.tonerLevel + tonerAmount>100) {
				return -1;
			}
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
		}else {
			return -1;
		}
	}
	
	public int printPage(int pages) {
		int pagesToPrint = pages;
		if(this.duplex) {
			pagesToPrint = (pages/2) + (pages%2);
			System.out.println("Printing duplex");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public static void main(String[] args) {
		
		

	}

}
