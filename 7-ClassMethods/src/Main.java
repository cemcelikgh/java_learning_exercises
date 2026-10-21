
public class Main {

	public static void main(String[] args) {

		Car car1 = new Car();

		car1.setModelYear(2026);
		System.out.println("Arabanın çıkış yılı: " + car1.gModelYear());
		System.out.println("Arabanın çıkış yılı: " + car1.getModelYear());

		car1.color = "Kırmızı";
		car1.setModel("Renault Clio");
		car1.engine = 1.5;
		car1.setDoors(4);
		car1.setModelYear(2020);

		System.out.println("Arabanın rengi: " + car1.getColor());
		System.out.println("Arabanın modeli: " + car1.getModel());
		System.out.println("Arabanın motor hacmi: " + car1.getEngine());
		System.out.println("Arabanın kapı sayısı: " + car1.getDoors());
		System.out.println("Arabanın çıkış yılı: " + car1.getModelYear());

		car1.start();
		car1.stop();

	}

}
