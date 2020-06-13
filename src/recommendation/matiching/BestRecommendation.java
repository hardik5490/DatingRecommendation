package recommendation.matiching;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.net.httpserver.Filter;

import recommendation.db.Database;
import recommendation.dto.User;
import recommendation.dto.UserWithRecomandationScore;

public class BestRecommendation {
	
	List<User> users;
	User findFor;
	int topLimit;
	public BestRecommendation(User findFor, int topLimit) {
		this.findFor = findFor;
		users = Database.getDatabaseInstance().getByGender(findFor.getGender().equals("Male")?"Female":"Male");
		this.topLimit = topLimit;
	}

	public List<String> getBestRecommendation()
	{
		MatchingScore matchingScore =  new MatchingScore(findFor);
		MatchingComparator scoreComparator = new MatchingComparator();
//		System.out.println(users);
		List<UserWithRecomandationScore> userWithScore = users.stream().
				filter((tempUser) -> !findFor.equals(tempUser)).
				map((u)->matchingScore.updateUserScore(u)).
				collect(Collectors.toList());
		
		Collections.sort(userWithScore,scoreComparator);
//		return userWithScore.stream().map((u)->new User(u.getName(), u.getAge(), u.getGender(), u.getIntrest()))
//				.limit(topLimit)
//				.collect(Collectors.toList());
		return userWithScore.stream().map((u)->u.getName())
				.limit(topLimit)
				.collect(Collectors.toList());
		
 	}
}
