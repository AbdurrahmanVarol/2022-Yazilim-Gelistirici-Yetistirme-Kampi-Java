package miniProjeArkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;

		int total1 = CalculateTotalOfRemainder(number1);
		int total2 = CalculateTotalOfRemainder(number2);

		if (total1 == number2 && total2 == number1) {
			System.out.println(number1 + " ve " + number2 + " Arkadaş sayıdır.");
			return;
		}
		System.out.println(number1 + " ve " + number2 + " Arkadaş sayı değildir.");

	}

	private static int CalculateTotalOfRemainder(int number) {
		int total = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		return total;
	}

}
