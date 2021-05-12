package day3.hw2;

public class Main {
	
	public static void main(String[] args) {
		// Instructor and associated manager objects
		Instructor instructor1 = new Instructor(1,"user1", "Öğreten", "Adam", "oa123@gmail.com", "12345", "hoca 1", new String[]{"Maths","Java","Python"});
		Instructor instructor2 = new Instructor(2,"user2", "Muallim", "Naci", "mn123@gmail.com", "0123", "hoca 2", new String[]{"Poetry","History"});
		
        Instructor[] instructors = {instructor1, instructor2};
		
		InstructorManager instructorManager = new InstructorManager();
		// Student and associated manager objects
		Student student1 = new Student(1, "user123","Ahmet", "Değnek", "ad123@hotmail.com", "123", new String[]{"Java","Python"});
		Student student2 = new Student(2, "user124", "Sezgi", "Bilgeli", "sb123@hotmail.com", "02468", new String[]{"Philosophy","Arts"});
		
		Student[] students = {student1, student2};
		
		StudentManager studentManager = new StudentManager();
		// Simulate instructor operations
		for (Instructor instructor : instructors) {
			instructorManager.add(instructor);
			instructorManager.update(instructor);
			instructorManager.delete(instructor);
			System.out.println("-o-");
		}
		//
		System.out.println("--------------------");
		// Simulate student operations
		for (Student student : students) {
			studentManager.add(student);
			studentManager.update(student);
			studentManager.delete(student);
			System.out.println("-o-");
		}
	}
}