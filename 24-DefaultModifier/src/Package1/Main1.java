package Package1;

// import Package2.Student2;
import Package3.Student3;

public class Main1 {

	public static void main(String[] args) {

		Student1 student1 = new Student1("Cem");
		// Student2 student2 = new Student2("Cem");
		Student3 student3 = new Student3("Cem");

		student1.study();
		student3.study();

	}

}
