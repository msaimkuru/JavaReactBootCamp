package nlayereddemo.business.abstracts;

import java.util.List;

import nlayereddemo.entities.concretes.Product;

/*
 * Business layer interface for product manager class
 */
public interface ProductService {
	void add(Product product);

	void update(Product product);

	void delete(Product product);

	Product get(int id);

	List<Product> getAll();
}