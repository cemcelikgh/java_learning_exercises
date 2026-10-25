
public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("Cem", "Yazılım", 9000000);

		employee.showInfo();

		System.out.println(" ");

		Manager manager = new Manager("Mustafa", "Yazılım", 90000000);

		manager.showInfo();

	}

}
