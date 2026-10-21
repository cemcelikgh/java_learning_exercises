
public class Car {

	public String color;
	public String model;
	public double engine;
	public int doors;
	public int modelYear;

	public int gModelYear() {
		return modelYear;
	}

	public int getModelYear() {
		return this.modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	// eclipse ide | right click -> source -> generate getters and setters...

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
		this.doors = doors;
	}

	public void start() {
		System.out.println("Araba çalıştı.");
	}

	public void stop() {
		System.out.println("Araba durdu.");
	}

}
