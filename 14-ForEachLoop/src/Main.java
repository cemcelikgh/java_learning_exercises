import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> groups = new ArrayList<String>();

		groups.add("Metallica");
		groups.add("Iron Maiden");
		groups.add("Guns' n Roses");
		groups.add("Black Sabbath");

		System.out.print("groups'un elemanları: ");

		for (String group : groups) {
			System.out.print(group + ", ");
		}

		System.out.println(" ");
		System.out.println("---------------------------------------------------------------------------");

		int[] arr = { 3, 4, 5, 6, 7, 8 };

		System.out.print("arr'ın elemanları: ");

		for (int i : arr) {
			System.out.print(i + ", ");
		}

	}

}
