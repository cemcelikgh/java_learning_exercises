
public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("Renault Megane", "Gümüş", 1.6, 4);

		car1.showInfos();

		System.out.println("-------------------------------");

		Car car2 = new Car();

		car2.showInfos();

		System.out.println("-------------------------------");

		Car car3 = new Car("Siyah", "Mercedes");

		car3.showInfos();

	}

}
