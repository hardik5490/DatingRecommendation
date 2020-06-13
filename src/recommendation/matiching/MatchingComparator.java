package recommendation.matiching;

import java.util.Comparator;

import recommendation.dto.UserWithRecomandationScore;

public class MatchingComparator implements Comparator<UserWithRecomandationScore> {

	@Override
	public int compare(UserWithRecomandationScore user1, UserWithRecomandationScore user2) {
		return user2.getScore() - user1.getScore();
	}

}
