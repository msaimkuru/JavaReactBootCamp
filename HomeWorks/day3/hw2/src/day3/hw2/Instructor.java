package day3.hw2;

public class Instructor extends User {
	String firstName;
	String lastName;
	String description;
	String[] coursesGiven;
	
	public Instructor() {
	}

	public Instructor(int id, String userName, String firstName, String lastName, String email, String password, String description, String[] coursesGiven) {
		this.setId(id);
		this.setuserName(userName);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
		this.description = description;
		this.coursesGiven = coursesGiven;
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

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getCoursesGiven() {
		return coursesGiven;
	}

	public void setCoursesGiven(String[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}
}