package interfaceAbstractDemo.concretes;

import java.util.Random;

import interfaceAbstractDemo.abstracts.ICustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

/*
 * This class simulates a Customer Checking Service in a random manner.
 * We can use this class for demonstration purposes instead of using
 * a MernisServiceAdapter class.
 */
public class CustomerCheckManager implements ICustomerCheckService {
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		Random r = new Random();
		return r.nextInt(2) == 0 ? true : false;
	}
}