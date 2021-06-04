
public class User {
	
	private int userId;
	private String userName;
	private String userlastName;
	private int userAge;
	public User(int userId, String userName, String userlastName, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userlastName = userlastName;
		this.userAge = userAge;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserlastName() {
		return userlastName;
	}
	public void setUserlastName(String userlastName) {
		this.userlastName = userlastName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	

	

}
