
class Animal {

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void makeSound() {
		System.out.println("Hayvan ses çıkarıyor.");
	}

}

class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + " ötüyor.");
	}

}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + " havlıyor.");
	}

}

public class Main {

	public static void mkSnd(Animal animal) {
		animal.makeSound();
	}

	public static void main(String[] args) {

		Manager manager = new Manager("Mustafa", "Yazılım", 90000000, 10);
		Employee employee = new Manager("Cem", "Yazılım", 9000000, 3);

		employee.showInfo();

		System.out.println("---------------------------");

		Animal animal = new Animal("Hayvan");
		Bird bird = new Bird("Limon");
		Dog dog = new Dog("Karabaş");

		animal.makeSound();
		bird.makeSound();
		dog.makeSound();

		System.out.println(" ");

		Animal animal2 = new Bird("Boncuk");
		Animal animal3 = new Dog("Duman");

		animal.makeSound();
		animal2.makeSound();
		animal3.makeSound();

		System.out.println(" ");

		mkSnd(new Animal("Hayvan"));
		mkSnd(new Bird("Nazlı"));
		mkSnd(new Dog("Dost"));

	}

}
