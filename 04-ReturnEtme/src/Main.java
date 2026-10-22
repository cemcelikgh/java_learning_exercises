
public class Main {

	public static void toplamıKonsoldaGöster(int a, int b, int c) {
		System.out.println("Toplam: " + (a + b + c));
	}

	public static int topla(int a, int b, int c) {
		return a + b + c;
	}

	public static int üçİleÇarp(int a) {
		return a * 3;
	}

	public static int ikiİleTopla(int a) {
		return a + 2;
	}

	public static int dörtÇıkar(int a) {
		return a - 4;
	}

	public static void main(String[] args) {

		toplamıKonsoldaGöster(3, 4, 5);

		System.out.println("Fonksiyonun return ettiği değer: " + topla(3, 4, 5));

		System.out.println("Sonuç: " + dörtÇıkar(ikiİleTopla(üçİleÇarp(4))));

	}

}
