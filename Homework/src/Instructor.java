
public class Instructor extends User{
	private String lessonOfinstructor;

public Instructor(int userId, String userName, String userlastName, int userAge, String lessonOfinstructor) {
		super(userId, userName, userlastName, userAge);
		this.lessonOfinstructor = lessonOfinstructor;
	}

	public String getLessonOfinstructor() {
		return lessonOfinstructor;
	}

	public void setLessonOfinstructor(String lessonOfinstructor) {
		this.lessonOfinstructor = lessonOfinstructor;
	}

}
