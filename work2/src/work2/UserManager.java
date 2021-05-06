package work2;

public class UserManager{
	public void add(User user) {
		System.out.println("Kullanıcı eklendi : " + user.getUserName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanıcı silindi : " + user.getUserName());
	}
	
	public void upDate (User user) {
		System.out.println("Değişiklikler güncellendi. Yeni id: " + user.getUserName());
	}
	
	public void addMultiple (User[] users) {
		for(User user: users)
			add(user);
	}
}
