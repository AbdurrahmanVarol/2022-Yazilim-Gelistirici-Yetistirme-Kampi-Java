package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {

		boolean asalMi = true;
		int number = 12;

		if(number<1) {
			System.out.println("Geçersiz sayı.");
			return;
		}
		if(number==1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				asalMi = false;
				break;
			}
		}

		if (asalMi) {
			System.out.println("Sayı asaldır.");
		} else {
			System.out.println("Sayı asal değildir.");
		}
	}
}
