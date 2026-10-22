
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

	// ---------------------------------------------------------------

	public Car() {
		this.model = "Bilgi yok";
		this.color = "Bilgi yok";
		this.engine = 0;
		this.doors = 0;
	}

//	yukarıdaki constructor'ın kısa yazılışı:
//
//	public Car() {
//		this("Bilgi yok", "Bilgi yok", 0, 0);
//	}

	// ---------------------------------------------------------------

	public Car(String color, String model) {
		this(color, model, 1.4, 4);
	}

	// ---------------------------------------------------------------

	public void showInfos() {
		System.out.println("Arabanın modeli: " + this.model);
		System.out.println("Arabanın rengi: " + this.color);
		System.out.println("Arabanın motor hacmi: " + this.engine);
		System.out.println("Arabanın kapı sayısı: " + this.doors);
	}

}
