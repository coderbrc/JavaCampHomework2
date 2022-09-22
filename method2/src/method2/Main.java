package method2;

public class Main {

	public static void main(String[] args) {
		int sayi = topla(5, 7);
		String mesaj = sehirVer();
		System.out.println(mesaj);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 4, 5, 6, 10);
		System.out.println("Toplam: " + toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void guncelle() {
		System.out.println("Güncellendi.");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam += i;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
