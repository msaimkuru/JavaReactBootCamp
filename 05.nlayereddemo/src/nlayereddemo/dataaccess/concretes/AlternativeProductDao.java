package nlayereddemo.dataaccess.concretes;

import java.util.List;

import nlayereddemo.dataaccess.abstracts.ProductDao;
import nlayereddemo.entities.concretes.Product;

/*
 * In Data Access Layer we create a product dao class for entity product.
 */
public class AlternativeProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Alternative Dao System added: " + product.getName());
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}