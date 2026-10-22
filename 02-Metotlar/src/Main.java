
import java.util.Scanner;

public class Main {

	public static void selamla() {
		System.out.println("Merhaba");
	}

	public static void faktöriyeliniAl() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz: ");

		int faktöriyel = 1;
		int sayı = scanner.nextInt();

		while (sayı > 0) {
			faktöriyel *= sayı;
			sayı--;
		}

		System.out.println("Girdiğiniz sayısının faktöriyeli: " + faktöriyel);

	}

	public static void main(String[] args) {

		selamla();

		faktöriyeliniAl();

	}

}
