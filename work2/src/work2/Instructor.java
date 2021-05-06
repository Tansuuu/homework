package work2;

public class Instructor extends User {
	
	private String education;
	
	public Instructor() {
		
	}
	
	public Instructor (int id, String firstName, String lastName, String email, String education) {
		super(id, firstName, lastName, email);
		this.education = education;
	}
	

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
}
