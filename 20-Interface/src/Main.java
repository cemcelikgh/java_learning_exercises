
public class Main {

	public static void main(String[] args) {

		// IDatabase database = new IDatabase;

		Student student = new Student();
		Customer customer = new Customer();

		student.log();
		customer.log();

		System.out.println(" ");

		IDatabase database1 = new Student();
		IDatabase database2 = new Customer();

		database1.log();
		database2.log();

	}

}
