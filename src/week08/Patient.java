package week08;

public class Patient {
	/*Create a class: Patient
     *Create 3 instance variables String firstName; String lastName;
     *Case caseOptions; using encapsulation
     *And create getters and setters
     *Go to CaseRunner class
     *Set your first and last name
     *And print your current case using the Case class objects
     */
	
	private String firstName;
	private String lastname;
	private Case caseOptions;
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Case getCaseOptions() {
		return caseOptions;
	}


	public void setCaseOptions(Case caseOptions) {
		this.caseOptions = caseOptions;
	}



}
