package miniProjeSayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = {1,24,4,5,2,44,643,12};
		int aranacalSayi = 5;
		
		boolean varMi = false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == aranacalSayi) {
				varMi = true;
				break;
			}
		}
		
		if (varMi) {
			System.out.println("Sayı Bulundu.");
			return;
		}
		System.out.println("Sayı Bulunamadı.");

	}

}
