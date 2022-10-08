package oopWithNLayerdApp.business;

import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {

		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 tan küçük olamaz.");
		}

		this.productDao.add(product);

		for (Logger logger : loggers) {
			logger.Log(product.getName());
		}

	}
}
