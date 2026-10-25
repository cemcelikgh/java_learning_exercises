import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> groups = new ArrayList<String>();

		groups.add("Metallica");
		groups.add("Iron Maiden");
		groups.add("Guns' n Roses");
		groups.add("Black Sabbath");

		System.out.println("0. index'teki element: " + groups.get(0));
		System.out.println("2. index'teki element: " + groups.get(2));

		System.out.println(" ");

		System.out.print("groups'un uzunluğu: " + groups.size());

		System.out.println(" ");

		System.out.print("groups elemanları: ");

		for (int i = 0; i < groups.size(); i++) {
			System.out.print(groups.get(i) + ", ");
		}

		System.out.println(" ");
		System.out.println(" ");

		groups.remove("Iron Maiden");

		System.out.print("groups'un kalan elemanları: ");

		for (int i = 0; i < groups.size(); i++) {
			System.out.print(groups.get(i) + ", ");
		}

		System.out.println(" ");
		System.out.println(" ");

		groups.remove(0);

		System.out.print("groups'un kalan elemanları: ");

		for (int i = 0; i < groups.size(); i++) {
			System.out.print(groups.get(i) + ", ");
		}

		System.out.println(" ");
		System.out.println(" ");

		System.out.print("Guns' n Roses, groups'un " + groups.indexOf("Guns' n Roses") + ". index'inde.");

	}

}
