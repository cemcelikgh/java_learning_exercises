
public class Main {

	public static void add(int a, int b, int c) {
		System.out.println("Sum: " + (a + b + c));
	}

	public static void add(int a, int b) {
		System.out.println("Sum: " + (a + b));
	}

	public static void add(int a, int b, int c, int d) {
		System.out.println("Sum: " + (a + b + c + d));
	}

	public static void displayScore(String name, int score) {
		System.out.println("Score of player " + name + ": " + score);
	}

	public static void displayScore(int score) {
		System.out.println("Player's score: " + score);
	}

	public static void displayScore(String name) {
		System.out.println("Score of player " + name + ": 0");
	}

	public static void main(String[] args) {

		add(3, 4, 5);
		add(3, 4);
		add(3, 4, 5, 6);

		displayScore("Cem", 3000);
		displayScore(1000);
		displayScore("Cem");

	}

}
