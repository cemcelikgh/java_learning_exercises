
public class Main {

	public static void main(String[] args) {

		// AbstractDatabase abstractDatabase = new AbstractDatabase();
		AbstractDatabase abstractDatabase2 = new MySqlDatabase();
		AbstractDatabase abstractDatabase1 = new MongoDatabase();

		abstractDatabase1.add();
		abstractDatabase2.add();

		abstractDatabase1.update();
		abstractDatabase2.update();

	}

}
