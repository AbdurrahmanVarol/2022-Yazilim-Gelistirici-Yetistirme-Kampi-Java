package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = { 1, 24, 4, 5, 2, 44, 643, 12 };
		int aranacalSayi = 5;

		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacalSayi) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayı Bulundu.");
			return;
		}
		mesajVer("Sayı Bulunamadı.");
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
