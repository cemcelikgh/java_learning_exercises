
import java.util.Scanner;

public class Main {

	public static void getAvarage(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("array'in elemanlarının ortalaması: " + (double) sum / arr.length);

	}

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50 };

		System.out.println("arr1'in 2. elemanı: " + arr1[1]);

		int[] arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;

		System.out.println("arr1'in 1. elemanı: " + arr1[0]);

		System.out.println("-----------------------------------------");

		// for (int i = 0; i < 5; i++) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1'in " + i + ". elemanı: " + arr1[i]);
		}

		System.out.println("-----------------------------------------");

		Scanner scanner = new Scanner(System.in);

		int[] arr3 = new int[5];

		for (int i = 0; i < arr3.length; i++) {
			System.out.print("arr3'nin " + i + ". elemanını giriniz: ");
			arr3[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3'nin " + i + ". elemanı: " + arr3[i]);
		}

		System.out.println("-----------------------------------------");

		int[] arr4 = new int[5];

		System.out.println("sırayla array'in elemanlarını giriniz: ");

		for (int i = 0; i < arr3.length; i++) {
			arr4[i] = scanner.nextInt();
		}

		getAvarage(arr4);

	}

}
