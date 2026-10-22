
public class Employee {

	private String name;
	private String department;
	private int salary;

	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public void showInfo() {
		System.out.println("Çalışan bilgileri:");
		System.out.println("İsim: " + this.name);
		System.out.println("Departman: " + this.department);
		System.out.println("Maaş: " + this.salary);
	}

}
