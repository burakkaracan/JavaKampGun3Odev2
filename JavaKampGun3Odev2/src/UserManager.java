
public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Giriþ Yaptý.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Çýkýþ Yaptý.");
	}
	
	public void comment(User user) {
		System.out.println(user.getFirstName() + " Yorum Yaptý.");
	}
}
