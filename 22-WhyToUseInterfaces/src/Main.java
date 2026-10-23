
class DatabaseManager {

	public void AddDatabase(IDatabase database) {

		database.add();

	}

	public void UpdateDatabase(IDatabase database) {

		database.add();

	}

	public void GetDatabase(IDatabase database) {

		database.add();

	}

	public void DeleteDatabase(IDatabase database) {

		database.add();

	}

}

public class Main {

	public static void main(String[] args) {

		DatabaseManager manager = new DatabaseManager();
		
		manager.AddDatabase(new MySqlDatabase());
		manager.AddDatabase(new MongoDatabase());

	}

}
