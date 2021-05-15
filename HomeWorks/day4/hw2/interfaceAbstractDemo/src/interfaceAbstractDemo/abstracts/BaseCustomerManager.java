package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;

/*
 * base class for specific customer manager sub classes
 */
public abstract class BaseCustomerManager implements ICustomerService {
	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to db: " + customer.getFirstName() + " " + customer.getLastName());
	}
}