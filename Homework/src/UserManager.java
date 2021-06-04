
public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserName()+" kaydedildi" );

		
	}
	public void addMultiple(User[] users) {
		for(User user: users) {
			System.out.println(user.getUserName());
		}
	}

}
