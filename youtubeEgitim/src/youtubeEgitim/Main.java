package youtubeEgitim;

public class Main {

	public static void main(String[] args) {
		// Değer tipler
		int sayi1 = 10;
		int sayi2 = 20;

		sayi1 = sayi2;
		sayi2 = 100;

		System.out.println(sayi1);

		// Referans tipler
		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 12, 22, 32 };

		sayilar1 = sayilar2;
		sayilar2[0] = 1000;

		System.out.println(sayilar1[0]);

		// Class
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();
		customer.id = 1;
		
		
		Company company = new Company();
		company.id = 1;
		company.companyName = "Arçelik";
		company.taxNumber = "1231321654";
		
		Person person = new Person();
		person.firsName = "Abdurrahman";
		person.lastName = "Varol";
		person.nationalIdentity = "97889456";
		
		ICreditManager creditManager2 = new CreditManager();
		ICreditManager creditManager3 = new TeacherCreditManager();
		ICreditManager creditManager4 = new MilitaryCreditManager();
		
		CustomerManager customerManager = new CustomerManager(customer,creditManager2);
		CustomerManager customerManager2 = new CustomerManager(person,creditManager3);
		CustomerManager customerManager3 = new CustomerManager(company,creditManager4);
		customerManager.save();
		customerManager.delete();
		
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		
	
	}

}
