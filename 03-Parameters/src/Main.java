
public class Main {

	public static void greet(String name) {

		System.out.println("Hello " + name);

	}

	public static void add(int a, int b, int c) {

		System.out.println("Sum: " + (a + b + c));

	}

	public static void main(String[] args) {

		greet("Cem");
		greet("Murat");

		add(3, 4, 5);
		add(29, 3, 40);

	}

}
