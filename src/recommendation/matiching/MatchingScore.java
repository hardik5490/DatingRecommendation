package recommendation.matiching;

import java.util.List;

import recommendation.dto.User;
import recommendation.dto.UserWithRecomandationScore;

public class MatchingScore {
	
	private User userMatchWith;

	public MatchingScore(User userMatchWith) {
		this.userMatchWith = userMatchWith;
	}

	public UserWithRecomandationScore updateUserScore(User user) {

		int score = 0; // user.getScore();
		if(!user.getGender().equals(userMatchWith.getGender()))
		{
			score += 5;
		}
		
		//age preference score
		score -= Math.abs(user.getAge() -  userMatchWith.getAge()) * 2;
		
		//Interest preference score
		List<String> UserToMatchIntrest = userMatchWith.getIntrest();
		for(String interest : user.getIntrest() )
		{
			if(UserToMatchIntrest.contains(interest))
				score += 1;
		}
		
//		System.out.println(score + " score for : "+ user.getName());
		return new UserWithRecomandationScore(user, score);
		
	}
		
}


