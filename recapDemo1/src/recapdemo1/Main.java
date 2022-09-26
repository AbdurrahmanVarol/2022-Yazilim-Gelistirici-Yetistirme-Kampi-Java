package recapdemo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1 = -50;
		int sayi2 = -100;
		int sayi3 = -10;
		int max = sayi1;

		if (max < sayi2) {
			max = sayi2;
		}
		if (max < sayi3) {
			max = sayi3;
		}

		System.out.println("En büyük sayı : " + max);
	}
}
