
public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("Gümüş", "Renault Megane", 1.6, 4);

		car1.showInfos();

		Car car2 = new Car();

		car2.showInfos();

		Car car3 = new Car("Siyah", "Mercedes");

		car3.showInfos();

	}

}
