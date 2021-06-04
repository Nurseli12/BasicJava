
public class Student extends User{
	private String takenBystudent;

	public Student(int userId, String userName, String userlastName, int userAge, String takenBystudent) {
		super(userId, userName, userlastName, userAge);
		this.takenBystudent = takenBystudent;
	}

	public String getTakenBystudent() {
		return takenBystudent;
	}

	public void setTakenBystudent(String takenBystudent) {
		this.takenBystudent = takenBystudent;
	}

}
