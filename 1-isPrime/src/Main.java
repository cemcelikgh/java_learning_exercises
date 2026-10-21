
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean asalMı = true;

		System.out.print("Asallığını öğrenmek istediğiniz sayıyı giriniz: ");
		int sayı = scanner.nextInt();

		for (int i = 2; i < sayı; i++) {
			if (sayı % i == 0) {
				asalMı = false;
				break;
			}
		}

		if (asalMı) {
			System.out.println(sayı + " asal sayıdır");
		} else {
			System.out.println(sayı + " asal sayı değildir.");
		}

	}

}
