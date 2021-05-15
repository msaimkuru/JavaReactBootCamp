package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;

/*
 * interface for defining a contract for common operations
 * for customers.
 */
public interface ICustomerService {
	void save(Customer customer) throws Exception;
}