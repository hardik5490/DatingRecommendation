package recommendation;

import java.util.List;

import recommendation.db.DbData;
import recommendation.dto.User;
import recommendation.matiching.BestRecommendation;

public class Application {

	public static void main(String[] args) {

		System.out.println("Available data to compute....");
		DbData.initilize(null);

		User findFor = new User("User C", 33, "Male", List.of("Tennis","Cricket", "Football", "Movies"));
		int topLimit = 2;
		BestRecommendation bestRecommendation = new BestRecommendation(findFor, topLimit);
		System.out.println("\n\n>>>>>>>>>>>>>>>>>>>>> OUTPUT >>>>>>>>>>>>>>>>");
		System.out.println(bestRecommendation.getBestRecommendation());
		
	}

}
