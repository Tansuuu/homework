package work2;

public class UserManager{
	public void add(User user) {
		System.out.println("Kullan�c� eklendi : " + user.getUserName());
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi : " + user.getUserName());
	}
	
	public void upDate (User user) {
		System.out.println("De�i�iklikler g�ncellendi. Yeni id: " + user.getUserName());
	}
	
	public void addMultiple (User[] users) {
		for(User user: users)
			add(user);
	}
}
