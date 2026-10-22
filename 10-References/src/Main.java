
public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("Gümüş", "Renault Megane", 1.6, 4);

		car1.showInfos();

		System.out.println("-------------------------------");

		Car car2 = car1;

		car2.showInfos();

		System.out.println("-------------------------------");

		Car car3;

		// car3.showInfos();

		car3 = new Car("Siyah", "BMW", 2.0, 4);

		car3.showInfos();

		System.out.println("-------------------------------");

		Car car4 = null;

		// car4.showInfos();

		System.out.println("-------------------------------");

		String s1 = new String("Cem");
		String s2 = new String("Cem");

		if (s1 == s2) {
			System.out.println("s1 ve s2 eşittir.");
		} else {
			System.out.println("s1 ve s2 eşit değildir.");
		}

		if (s1.equals(s2)) {
			System.out.println("s1 ve s2'nun değerleri eşittir.");
		} else {
			System.out.println("s1 ve s2'nun değerleri eşit değildir.");
		}

	}

}
