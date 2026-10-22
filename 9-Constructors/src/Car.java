
public class Car {

	private String color;
	private String model;
	private double engine;
	private int doors;

	public Car(String color, String model, double engine, int doors) {
		this.color = color;
		this.model = model;
		this.engine = engine;
		this.doors = doors;
	}

	public Car() {
		this.color = "Bilgi yok";
		this.model = "Bilgi yok";
		this.engine = 0;
		this.doors = 0;
	}

//	yukarıdaki constructor'ın kısa yazılışı:
//
//	public Car() {
//		this("Bilgi yok", "Bilgi yok", 0, 0);
//	}

	public Car(String color, String model) {
		this(color, model, 1.4, 4);
	}

	public void showInfos() {
		System.out.println("Arabanın rengi: " + this.color);
		System.out.println("Arabanın modeli: " + this.model);
		System.out.println("Arabanın motor hacmi: " + this.engine);
		System.out.println("Arabanın kapı sayısı: " + this.doors);
	}

}
