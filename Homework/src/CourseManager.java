
public class CourseManager {

	public void delete(Course course) {
		System.out.println("Silinen kursumuz "+course.getCourseName());
	}
	public void update(Course course) {
		System.out.println("G�ncellenen kursumuz "+course.getCourseName());
	}
	public void addMultipleCourse(Course[] courses) {
		for(Course course : courses) {
			System.out.println(course.getCourseName());
		}
	}

		
	}


