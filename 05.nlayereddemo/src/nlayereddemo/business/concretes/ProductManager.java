package nlayereddemo.business.concretes;

import java.util.List;

import nlayereddemo.business.abstracts.ProductService;
import nlayereddemo.core.LoggerService;
import nlayereddemo.dataaccess.abstracts.ProductDao;
import nlayereddemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// Business layer codes
		if (product.getCategoryId() == 1) {
			System.out.println("Product with category id 1 can not be accepted.");
			// return without doing data access operations.
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Product added:" + product.getId() + "-" + product.getName());
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