package recommendation.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import recommendation.db.DbData;
import recommendation.dto.User;
import recommendation.matiching.BestRecommendation;

public class ApplicationTest {
	
	@Before
	public void init()
	{
		DbData.initilize(null);
	}
	
	@After
	public void destroy()
	{
		DbData.destroy();
	}
	
	@Test
	public void maleRecommendationTest1()
	{
		User findFor = new User("User C", 33, "Male", List.of("Tennis","Cricket", "Football", "Movies"));
		int topLimit = 2;
		BestRecommendation bestRecommendation = new BestRecommendation(findFor, topLimit);
		Assert.assertEquals(List.of("User E", "User A"), bestRecommendation.getBestRecommendation());
	}
	
	@Test
	public void maleRecommendationTestwithMoreAgeDifference()
	{
		User findFor = new User("User B", 27, "Male", List.of("Cricket", "Football", "Movies"));
		int topLimit = 2;
		BestRecommendation bestRecommendation = new BestRecommendation(findFor, topLimit);
		Assert.assertEquals(List.of("User A", "User D"), bestRecommendation.getBestRecommendation());
	}

}
