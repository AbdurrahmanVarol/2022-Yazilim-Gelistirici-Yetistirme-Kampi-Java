package oop1;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Laptop");
		product1.setUnitInStock(2);
		product1.setUnitPrice(5000);
		product1.setImageUrl("asd.svg");
		product1.setDiscount(5);
		
		Product product2 = new Product();
		product2.setName("Laptop2");
		product2.setUnitInStock(3);
		product2.setUnitPrice(8000);
		product2.setImageUrl("asd2.svg");
		product2.setDiscount(7);
		
		Product product3 = new Product();
		product3.setName("Laptop3");
		product3.setUnitInStock(9);
		product3.setUnitPrice(4000);
		product3.setImageUrl("asd3.svg");
		product3.setDiscount(2);
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("123456");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhoneNumber("56465456");
		corporateCustomer.setCustomerNumber("8799456");
		corporateCustomer.setCompanyName("asdasd");
		corporateCustomer.setTaxNumber("2146687");
	}
}
