package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ogrenci1 = "Ahmet";
		String ogrenci2 = "Ali";
		String ogrenci3 = "Mehmet";
		String ogrenci4 = "Faruk";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("----------------------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ahmet";
		ogrenciler[1] = "Ali";
		ogrenciler[2] = "Mehmet";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("----------------------------");
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
