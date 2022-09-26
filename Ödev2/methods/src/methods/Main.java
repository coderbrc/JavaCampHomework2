package methods;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 0;
		boolean durum = false;
		for (int i : sayilar) {
			if (i == aranacak) {
				durum = true;
				break;
			}
		}
		if (durum) {
			mesajVer(aranacak+"sayısı bulundu.");
		} else {
			mesajVer(aranacak + "sayısı dizide yoktur.");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
