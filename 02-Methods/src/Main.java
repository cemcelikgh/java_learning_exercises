
import java.util.Scanner;

public class Main {

	public static void greet() {
		System.out.println("Hello");
	}

	public static void calculateFactorial() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number whose factorial you want to calculate: ");

		int factorial = 1;
		int number = scanner.nextInt();

		while (number > 0) {
			factorial *= number;
			number--;
		}

		System.out.println("The factorial of the number you entered is: " + factorial);

	}

	public static void main(String[] args) {

		greet();

		calculateFactorial();

	}

}
