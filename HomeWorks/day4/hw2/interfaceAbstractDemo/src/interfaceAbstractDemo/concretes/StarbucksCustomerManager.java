package interfaceAbstractDemo.concretes;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.abstracts.ICustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

/*
 * ICustomerCheckService reference is injected with the constructor.
 * So we can any time inject a different/compatible validator
 * without changing and recompiling the code
 */
public class StarbucksCustomerManager extends BaseCustomerManager {
	ICustomerCheckService iCustomerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
		this.iCustomerCheckService = iCustomerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if (iCustomerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			throw new Exception("Not a valid person!");
		}
	}
}