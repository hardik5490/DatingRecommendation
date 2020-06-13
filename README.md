# DatingRecommendation
Dating recommandation solution for interview screening purpose

Application Description:-
Recommendation engine applies following rules in given order while identifying the closest
matches:
• Gender Rule: Opposite gender is given a preference.
• Age rule: Closest match in terms of age is given a preference.
• Interest rule: Closest match in terms of interests is given a preference.

How to run ?
Main/Start file : DatingRecommendation/src/recommendation/Application.java 
run Application file with IDE or complie and run class file

How to set for which user recommandation ?
In BestRecommendation.java file getBestRecommendation function can give best top recommendation.
Usage like below:
    User findFor = new User("User C", 33, "Male", List.of("Tennis","Cricket", "Football", "Movies"));
		int topLimit = 2;
		BestRecommendation bestRecommendation = new BestRecommendation(findFor, topLimit);
		System.out.println(bestRecommendation.getBestRecommendation()); // It will list top 2 user recommendations.

