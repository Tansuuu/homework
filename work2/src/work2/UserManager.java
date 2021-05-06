package work2;

public class UserManager{
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : " + user.getUserName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi : " + user.getUserName());
	}
	
	public void upDate (User user) {
		System.out.println("Deðiþiklikler güncellendi. Yeni id: " + user.getUserName());
	}
	
	public void addMultiple (User[] users) {
		for(User user: users)
			add(user);
	}
}
