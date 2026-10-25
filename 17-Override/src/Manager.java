
public class Manager extends Employee {

	private int num_of_employees;

	public Manager(String name, String department, int salary, int num_of_employees) {

		super(name, department, salary);
		this.num_of_employees = num_of_employees;

	}

	public void raiseSalary(int amount) {
		System.out.println("Menejerlere " + amount + " TL zam yapıldı.");
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("İdare ettiği kişi sayısı: " + this.num_of_employees);
	}

}
