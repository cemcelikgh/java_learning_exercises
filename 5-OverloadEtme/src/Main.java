
public class Main {

	public static void topla(int a, int b, int c) {
		System.out.println("Toplam: " + (a + b + c));
	}

	public static void topla(int a, int b) {
		System.out.println("Toplam: " + (a + b));
	}

	public static void topla(int a, int b, int c, int d) {
		System.out.println("Toplam: " + (a + b + c + d));
	}

	public static void skoruGöster(String isim, int skor) {
		System.out.println(isim + " isimli oyuncunun skoru: " + skor);
	}

	public static void skoruGöster(int skor) {
		System.out.println("Oyuncunun skoru: " + skor);
	}

	public static void skoruGöster(String isim) {
		System.out.println(isim + " isimli oyuncunun skoru: 0");
	}

	public static void main(String[] args) {

		topla(3, 4, 5);
		topla(3, 4);
		topla(3, 4, 5, 6);

		skoruGöster("Cem", 3000);
		skoruGöster(1000);
		skoruGöster("Cem");

	}

}
