package day3.hw2;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanıcı Eklendi: " + user.getUserName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanıcı Silindi: " + user.getUserName());
	}
	
	public void update(User user) {
		System.out.println("Kullanıcı Güncellendi: " + user.getUserName());
	}
}