package work2;

public class Student extends User {
	
	private String myLesson;
	
	public Student() {
		
	}
	
	public Student (int id, String firstName, String lastName, String email, String myLesson) {
		super(id, firstName, lastName, email);
		this.myLesson = myLesson;
	}

	
	public String getMyLesson() {
		return myLesson;
	}

	public void setMyLesson(String myLesson) {
		this.myLesson = myLesson;
	}

}
