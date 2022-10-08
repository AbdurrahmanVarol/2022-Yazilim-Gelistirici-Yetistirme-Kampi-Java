package oopWithNLayerdApp;

import oopWithNLayerdApp.business.ProductManager;
import oopWithNLayerdApp.core.logging.DatabaseLogger;
import oopWithNLayerdApp.core.logging.FileLogger;
import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccess.JdbcProductDao;
import oopWithNLayerdApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone Xr", 10000);

		Logger[] loggers = { new FileLogger(), new DatabaseLogger() };
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);
	}

}
