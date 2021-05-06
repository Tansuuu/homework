package work2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student ();
		student1.setId(1);
		student1.setFirstName("Tansu");
		student1.setLastName("Tekin");
		student1.setEmail("tansu@hotmail.com");
		student1.setMyLesson("Java");
		
		Student student2 = new Student(2, "Hande", "Yılmaz", "hande@hotmail.com", "Java");
		
		Instructor instructor1 = new Instructor (1, "Engin", "Demiroğ", "engin@hotmail.com", "C#");
		Instructor instructor2 = new Instructor (2,"Aydın", "Aydın", "aydın@hotmail.com", "Java");
		
		System.out.println(student2.getUserName());
		
		System.out.println("--------------------------------------------------------------");
		
		
		User[] users = {student1, student2, instructor1, instructor2};
		for (User user: users) {
			System.out.println(user.getFirstName());
		}
		
		System.out.println("--------------------------------------------------------------");
		
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.delete(instructor1);
		userManager.upDate(instructor1);
		
		System.out.println("--------------------------------------------------------------");
		
		userManager.addMultiple(users);
		
	}

}
