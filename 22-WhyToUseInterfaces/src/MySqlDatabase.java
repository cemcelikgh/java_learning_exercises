
public class MySqlDatabase implements IDatabase {

	@Override
	public void add() {

		System.out.println("MySQL added");

	}

	@Override
	public void delete() {

		System.out.println("MySQL deleted");

	}

	@Override
	public void get() {

		System.out.println("MySQL got");

	}

	@Override
	public void update() {

		System.out.println("MySQL updated");

	}

}
