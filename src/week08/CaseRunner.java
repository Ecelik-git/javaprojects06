package week08;

public class CaseRunner {
	/*
     * Create CaseRunner class
     * actualCase=Covid 19
     * isTested=true
     * conclusion=Tested Negative
     *
     * if conclusion contains "negative" print "You can go to work"
     * otherwise print "15 days quarantine"
     */
	public static void main(String[] args) {
		
		Case c = new Case();
		c.setFirstName("David");
		c.setLastname("Steel");
		c.setActualCase("Covid 19");
		c.setTested(true);
		c.setConclusion("Tested Negative");
		
		if(c.getConclusion().toLowerCase().contains("negative")) {
			System.out.println(c.getFirstName()+", you can go to work, "
					+ "because you "+ c.getConclusion());
		}else {
			System.out.println(c.getFirstName()+", 15 days quarantine, "
					+ "because you "+c.getConclusion());
		}
		
		

	}

}
