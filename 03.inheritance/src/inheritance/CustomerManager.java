package inheritance;

public class CustomerManager {
	/*
	 * By help of using base class reference type Customer for holding specific
	 * subclasses of Customer we apply polymorphism of OOP and open closed principle
	 * of SOLID.
	 */
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " numaralı müşteri kaydedildi.");
	}

	// bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			System.out.print("Bulk insert-> ");
			add(customer);
		}
	}
}