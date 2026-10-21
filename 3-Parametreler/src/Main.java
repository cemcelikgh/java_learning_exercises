
public class Main {

	public static void selamla(String isim) {

		System.out.println("Merhaba " + isim);

	}

	public static void topla(int a, int b, int c) {

		System.out.println("Toplam: " + (a + b + c));

	}

	public static void main(String[] args) {

		selamla("Cem");
		selamla("Murat");

		topla(3, 4, 5);
		topla(29, 3, 40);

	}

}
