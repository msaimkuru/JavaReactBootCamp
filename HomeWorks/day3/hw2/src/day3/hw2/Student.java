package day3.hw2;

public class Student extends User {
	String firstName;
	String lastName;
	String[] coursesTaken;

	public Student() {
	}

	public Student(int id, String userName, String firstName, String lastName, String email, String password, String[] coursesTaken) {
		this.setId(id);
		this.setuserName(userName);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
		this.coursesTaken = coursesTaken;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesGiven(String[] coursesTaken) {
		this.coursesTaken = coursesTaken;
	}
}