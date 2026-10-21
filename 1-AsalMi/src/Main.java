
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean isPrime = true;

		System.out.print("Enter the number you want to check for primality: ");
		int number = scanner.nextInt();

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number.");
		}

	}

}
