
public class Car {

	private String color;
	private String model;
	private double engine;
	private int doors;
	private int modelYear;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		if (doors == 2 || doors == 4) {
			this.doors = doors;
		} else {
			System.out.println("Kapı sayısı 2 veya 4 olabilir.");
		}
	}

}
