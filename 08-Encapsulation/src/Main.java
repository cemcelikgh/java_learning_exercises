
public class Main {

	public static void main(String[] args) {

		Car car1 = new Car();

		car1.setModel("Renault Clio");
		car1.setModelYear(2020);
		car1.setEngine(1.5);
		car1.setColor("Kırmızı");

		System.out.println("Arabanın modeli: " + car1.getModel());
		System.out.println("Arabanın çıkış yılı: " + car1.getModelYear());
		System.out.println("Arabanın motor hacmi: " + car1.getEngine());
		System.out.println("Arabanın rengi: " + car1.getColor());

		System.out.println("------------------------------");

		car1.setDoors(3);
		car1.setDoors(2);
		System.out.println("Arabanın kapı sayısı: " + car1.getDoors());

	}

}
