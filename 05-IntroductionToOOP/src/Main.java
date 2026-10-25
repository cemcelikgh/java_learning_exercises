
public class Main {

	public static void main(String[] args) {

		Car car1 = new Car();

		car1.model = "Renault Megane";
		car1.color = "Gümüş";
		car1.engine = 1.6;
		car1.doors = 4;

		System.out.println("Arabanın modeli: " + car1.model);
		System.out.println("Arabanın rengi: " + car1.color);
		System.out.println("Arabanın motor hacmi: " + car1.engine);
		System.out.println("Arabanın kapı sayısı: " + car1.doors);

		// System.out.println("Arabanın çıkış yılı: " + car1.modelYear);

	}

}
