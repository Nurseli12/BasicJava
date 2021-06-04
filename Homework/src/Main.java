
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setCourseCount("1. Kursumuz: ");
		course1.setId(1);
		course1.setCourseName("Java");
		
		Course course2 = new Course();
		course2.setCourseCount("2. Kursumuz: ");
		course2.setId(2);
		course2.setCourseName("C#");
		
		Course course3 = new Course();
		course3.setCourseCount("3. Kursumuz: ");
		course3.setId(3);
		course3.setCourseName("Kampa Hazırlık Kursumuz");
		
		System.out.println("MEVCUT KURSLARIMIZ: ");
		
		Course[] courses ={
				course1,
				course2,
				course3,			
		};
		CourseManager courseManagerArray1 = new CourseManager();
		courseManagerArray1.addMultipleCourse(courses);
		System.out.println(" ");
		
		Course course4 = new Course();
		course4.setCourseCount("4. Kursumuz: ");
		course4.setId(4);
		course4.setCourseName("CSS Kursumuz: ");
		
		Course course5 = new Course();
		course5.setCourseCount("5. Kursumuz: ");
		course5.setId(5);
		course5.setCourseName("JavaScript");
		
		System.out.println("YENİ AÇILAN KURSLARIMIZ");
		Course[] newCourses ={
				course4,
				course5
							
		};
		CourseManager courseManagerArray2 = new CourseManager();
		courseManagerArray2.addMultipleCourse(newCourses);
		System.out.println(" ");
			
		
		
		
		System.out.println("ÖĞRETMENLERİMİZ: ");
		
		Instructor instructor1 = new Instructor(1,"Engin","Demiroğ",35,"Java");	
		UserManager userManager1 = new UserManager();
		userManager1.add(instructor1);
		System.out.println(" ");
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager1.add(instructor1);
		System.out.println(" ");
		
		Instructor instructor2 = new Instructor(2,"Mahmut","Kaya",32,"C#");
		UserManager userManager2 = new UserManager();
		userManager2.add(instructor2);
		System.out.println(" ");
		InstructorManager instructorManager2 = new InstructorManager();
		instructorManager2.add(instructor2);
		System.out.println(" ");
		
		
		
		System.out.println("ÖĞRENCİLERİMİZ: ");
		
		Student student1 = new Student(1, "Nurseli", "Kaya", 24, "Java");		
		UserManager userManager4 = new UserManager();
		userManager4.add(student1);
		System.out.println(" ");
		StudentManager studentManager1 = new StudentManager();
		studentManager1.add(student1);
		System.out.println(" ");
		
		System.out.println("BÜNYEMİZDEKİ HERKES: ");
		
		UserManager userManager = new UserManager();
		User[] users = {instructor1,instructor2,student1};
		userManager.addMultiple(users);

		
		


		
		


	}

}
