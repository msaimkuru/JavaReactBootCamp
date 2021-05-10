package inheritance;

public class Main {
	public static void main(String[] args) {
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.id = 1;
		individualCustomer.customerNumber = "12345";

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.id = 2;
		corporateCustomer.customerNumber = "98765";

		UnionCustomer unionCustomer = new UnionCustomer();
		unionCustomer.id = 3;
		unionCustomer.customerNumber = "13579";

		// Manager class is created to perform operations
		CustomerManager customerManager = new CustomerManager();

		customerManager.add(individualCustomer);
		customerManager.add(corporateCustomer);
		customerManager.add(unionCustomer);

		// A polymorphic array
		Customer[] customers = { individualCustomer, corporateCustomer, unionCustomer };

		customerManager.addMultiple(customers);
	}
}