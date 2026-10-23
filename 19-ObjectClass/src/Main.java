
public class Main {

	public static void main(String[] args) {

		Manager manager1 = new Manager("Mustafa", "Yazılım", 90000000, 10);
		Object object = new Object();

		System.out.println(manager1);
		System.out.println(manager1.toString());

		System.out.println("----------------");

		System.out.println(object.equals(manager1));

		System.out.println(manager1.equals(object));

	}

}
