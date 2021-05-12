package day3.hw2;

public class StudentManager extends UserManager {
	@Override
	public void add(User student) {
		super.add(student);
		if (student instanceof Student) {
			System.out.println(
					"\tÖğrenci: " + ((Student) student).getFirstName() + " " + ((Student) student).getLastName());
		}
	}
}