package work1;

public class Main {

	public static void main(String[] args) {
		
		Program program1 = new Program ("C#", 50, "Engin Demiro�");
		
		Program program2 = new Program();
		program2.name = "Java";
		program2.percent = 75;
		program2.instructorName = "Engin Demiro�";
		
		Program[] programs = {program1, program2};
		
		for (Program program : programs) {
			System.out.println(program.name);
		}
		
		ProgramManager programManager = new ProgramManager();
		programManager.addCourse(program2);
		programManager.addTic(program2);
		
	}

}
