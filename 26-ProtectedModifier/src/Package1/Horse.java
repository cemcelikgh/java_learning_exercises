package Package1;

import Package2.Animal;

public class Horse extends Animal {

	public Horse(String name) {
		super(name);
	}

	public void makeSound() {
		System.out.println(this.name + " make sound.");
	}

}
