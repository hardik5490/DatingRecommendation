package recommendation.db;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import recommendation.dto.User;

public class Database {
	
	private static volatile Database instance;
	
	private Database() {}
	
	public static Database getDatabaseInstance()
	{
		if(instance == null)
		{
			synchronized (Database.class) {
				if(instance == null)
				{
					instance = new Database();
				}
			}
		}
		return instance;
	}
	
	List<User> allUsers;
	ConcurrentHashMap<String, List<User>> groupWiseUser =  new ConcurrentHashMap<>();
	
	
	public void addAll(List<User> users)
	{
		for(User user : users)
		{
			if(!groupWiseUser.containsKey(user.getGender()))
				groupWiseUser.put(user.getGender(), new ArrayList<User>());
			groupWiseUser.get(user.getGender()).add(user);
			System.out.println(user);
		}
	}
	
	public List<User> getByGender(String gender)
	{
		return groupWiseUser.get(gender);
	}

	public void removeAll() {
		groupWiseUser.clear();
	}

}
