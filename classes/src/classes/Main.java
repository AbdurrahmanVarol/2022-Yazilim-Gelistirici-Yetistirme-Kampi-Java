package classes;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		customerManager.remove();
		customerManager.update();

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 11, 22, 33, 44, 55 };

		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}
}
