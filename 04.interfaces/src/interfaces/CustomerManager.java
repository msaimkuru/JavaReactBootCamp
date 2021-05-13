package interfaces;

public class CustomerManager{
	/* By dependency injection we make our dependency 
	 * loosely coupled on logging mechanism
	 */
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müşteri eklendi: " + customer.getFirstName());
		
		//Logger logger = new DatabaseLogger(); /* tightly coupled dependency*/
		//for(Logger logger : loggers) {
		//	logger.log(customer.getFirstName() );
		//}
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi: " + customer.getFirstName());
		
		//Logger logger = new DatabaseLogger(); /* tightly coupled dependency*/
		//for(Logger logger : loggers) {
		//	logger.log(customer.getFirstName() );
		//}	
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}