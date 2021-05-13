package interfaces;

public class Main {
	public static void main(String[] args) {
		Logger[] loggers = {new DatabaseLogger(), new EmailLogger(), new SmsLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
	
		Customer customer1 = new Customer(1, "Ali", "Veli");
		
		customerManager.add(customer1);
		customerManager.delete(customer1);
	}	
}