
public class Main {

	public static void main(String[] args) {
		
		Instructor user1 = new Instructor(1, "Engin", "Demiroğ", "demirog@index.com", 100);
		Student user2 = new Student(2, "Burak", "Karacan", "karacan@index.com", 3);
		
		UserManager userManager = new UserManager();
		userManager.login(user1);
		userManager.login(user2);
		
		userManager.comment(user2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.shareCourse(user1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(user2);
	}

}
