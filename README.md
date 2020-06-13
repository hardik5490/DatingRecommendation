# DatingRecommendation
Dating recommandation solution for interview screening purpose
<br>
Application Description:-<br>
Recommendation engine applies following rules in given order while identifying the closest
matches:<br>
• Gender Rule: Opposite gender is given a preference.<br>
• Age rule: Closest match in terms of age is given a preference.<br>
• Interest rule: Closest match in terms of interests is given a preference.<br>
<br><br>
How to run? <br>
Main/Start file : DatingRecommendation/src/recommendation/Application.java <br>
run Application file with IDE or complie and run class file<br><br><br>

How to set for which user recommandation ?<br>
In BestRecommendation.java file getBestRecommendation function can give best top recommendation.<br><br>
Usage like below:<br>
    User findFor = new User("User C", 33, "Male", List.of("Tennis","Cricket", "Football", "Movies"));<br>
    int topLimit = 2;<br>
    BestRecommendation bestRecommendation = new BestRecommendation(findFor, topLimit);<br>
    System.out.println(bestRecommendation.getBestRecommendation()); // It will list top 2 user recommendations. <br>

