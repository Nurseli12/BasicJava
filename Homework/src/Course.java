
public class Course {
	private int id;
	private String courseName;
	private String courseCount;
	public Course() {
		
	}
	public Course(int id, String courseName, String courseCount) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseCount = courseCount;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCount() {
		return courseCount;
	}
	public void setCourseCount(String courseCount) {
		this.courseCount = courseCount;
	}
}
