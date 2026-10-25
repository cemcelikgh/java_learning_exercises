
public class Main {

	public void method1() {
		System.out.println("non-static method");
	}

	public static void method2() {
		System.out.println("static method");
	}

	public static void main(String[] args) {

		System.out.println("Number of students: " + Student.no_of_students);

		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		System.out.println("Number of students: " + student1.no_of_students);

		System.out.println("Which keyword: " + Student.whichKeyword());

		// method1();

		method2();

	}

}
