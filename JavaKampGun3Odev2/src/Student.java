
public class Student extends User {
	int numberOfCourse;

	public Student(int id, String firstName, String lastName, String email, int numberOfCourse) {
		super(id, firstName, lastName, email);
		this.numberOfCourse = numberOfCourse;
	}
}
