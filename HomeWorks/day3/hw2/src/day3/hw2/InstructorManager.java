package day3.hw2;

public class InstructorManager extends UserManager {
	@Override
	public void add(User instructor) {
		super.add(instructor);
		if (instructor instanceof Instructor) {
			System.out.println("	\tEğitmen: " + ((Instructor) instructor).getFirstName() + " "
					+ ((Instructor) instructor).getLastName());
		}
	}
}