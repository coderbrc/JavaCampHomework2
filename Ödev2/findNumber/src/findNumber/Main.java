package findNumber;

public class Main {

	public static void main(String[] args) {
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
			System.out.println("Sayi bulundu");
		} else {
			System.out.println("Aranan sayı dizide yoktur.");
		}
	}
}
