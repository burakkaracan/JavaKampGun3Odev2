
public class StudentManager extends UserManager {
	public void joinCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Kursa Katıldı");
	}
	
	public void leaveCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Kurstan Ayrıldı");
	}
}
