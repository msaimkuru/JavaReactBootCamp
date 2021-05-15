package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;

/*
 * interface that defines a contract for validating a person.
 */
public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}