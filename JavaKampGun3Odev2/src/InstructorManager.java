
public class InstructorManager extends UserManager {
	public void shareCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " Kursu Yayýnladý");
	}
	
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " Kursu Sildi");
	}
}
