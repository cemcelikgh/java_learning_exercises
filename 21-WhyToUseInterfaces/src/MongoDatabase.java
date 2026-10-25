
public class MongoDatabase implements IDatabase {

	@Override
	public void add() {

		System.out.println("Mongo added");

	}

	@Override
	public void delete() {

		System.out.println("Mongo deleted");

	}

	@Override
	public void get() {

		System.out.println("Mongo got");

	}

	@Override
	public void update() {

		System.out.println("Mongo updated");

	}

}
