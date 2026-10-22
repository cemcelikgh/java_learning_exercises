
public class Car {

	private String model;
	private String color;
	private double engine;
	private int doors;

	public Car(String model, String color, double engine, int doors) {
		this.model = model;
		this.color = color;
		this.engine = engine;
		this.doors = doors;
	}

	public void showInfos() {
		System.out.println("Arabanın modeli: " + this.model);
		System.out.println("Arabanın rengi: " + this.color);
		System.out.println("Arabanın motor hacmi: " + this.engine);
		System.out.println("Arabanın kapı sayısı: " + this.doors);
	}

}
