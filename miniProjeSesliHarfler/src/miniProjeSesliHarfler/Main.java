package miniProjeSesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'A';

		switch (harf) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kalın Sesli Harftir");
			break;
		case 'E':
		case 'İ':
		case 'Ü':
		case 'Ö':
			System.out.println("İnce Sesli Harftir");
			break;

		default:
			System.out.println("Geçersiz Harftir");
		}
	}
}
