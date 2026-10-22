
public class Car {

	private String model;
	private int modelYear;
	private double engine;
	private String color;
	private int doors;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoors() {
		return doors;
	}

	// ----------------------------------------------------------

	public void setDoors(int doors) {
		if (doors == 2 || doors == 4) {
			this.doors = doors;
		} else {
			System.out.println("Kapı sayısı 2 veya 4 olabilir.");
		}
	}

}
