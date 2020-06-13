package recommendation.dto;

import java.util.List;

public class UserWithRecomandationScore extends User{

	int score = 0;
	
	/*
	 * As of now not need as per problem statement its not exist, if required to use
	 * in future 
	 * Map<Integer> prefrencesScore;
	 */
	
	public UserWithRecomandationScore(String name, int age, String gender, List<String> intrest) {
		super(name, age, gender, intrest);
	}

	public UserWithRecomandationScore(User user, int score) {
		super(user.getName(), user.getAge(), user.getGender(), user.getIntrest());
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
}
