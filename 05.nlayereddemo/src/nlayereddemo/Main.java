package nlayereddemo;

import nlayereddemo.business.abstracts.ProductService;
import nlayereddemo.business.concretes.ProductManager;
import nlayereddemo.core.JLoggerManagerAdapter;
import nlayereddemo.dataaccess.concretes.AlternativeProductDao;
import nlayereddemo.dataaccess.concretes.HibernateProductDao;
import nlayereddemo.entities.concretes.Product;

public class Main {
	public static void main(String[] args) {
		// TODO: Spring IOC will handle this object creation with new operation.
		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		//
		Product product1 = new Product(1, 1, "Apple", 5, 35);
		Product product2 = new Product(2, 2, "Orange", 10, 1000);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		productService.add(product1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		productService.add(product2);
		//
		// We can change Dao System just in a plug&play manner.
		productService = new ProductManager(new AlternativeProductDao(), new JLoggerManagerAdapter());
		//
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		productService.add(product1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		productService.add(product2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}