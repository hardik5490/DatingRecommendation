package recommendation.db;

import java.util.ArrayList;
import java.util.List;

import recommendation.dto.User;

public class DbData {
	
	private static User[] defaultUsers = {
			new User("User A", 25, "Female", List.of("Cricket")),
			new User("User B", 27, "Male", List.of("Cricket", "Football", "Movies")),
			new User("User C", 26, "Male", List.of("Movies", "Tennis", "Football", "Cricket")),
			new User("User D", 24, "Female", List.of("Tennis","Football","Badminton")),
			new User("User E", 32, "Female", List.of("Cricket", "Football", "Movies", "Badminton"))
	};

	//while loading data if users passed then those data also will be added.
	// if data is not passed then only default data will be available.
	public static void initilize(List<User> users)
	{
		if(users == null)
			users = new ArrayList<>();
		Database database = Database.getDatabaseInstance();
		users.addAll(List.of(defaultUsers));
		database.addAll(users);
		
	}

	public static void destroy() {
		Database database = Database.getDatabaseInstance();
		database.removeAll();
	}
	
}