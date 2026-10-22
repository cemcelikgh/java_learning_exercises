
public class Main {

	public static void displaySumInConsole(int a, int b, int c) {
		System.out.println("Sum: " + (a + b + c));
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int multiplyByThree(int a) {
		return a * 3;
	}

	public static int addTwo(int a) {
		return a + 2;
	}

	public static int subtractFour(int a) {
		return a - 4;
	}

	public static void main(String[] args) {

		displaySumInConsole(3, 4, 5);

		System.out.println("Value returned by the method: " + add(3, 4, 5));

		System.out.println("Result: " + subtractFour(addTwo(multiplyByThree(4))));

	}

}
