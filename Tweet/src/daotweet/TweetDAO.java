package daotweet;

import java.sql.SQLException;


public interface TweetDAO {
      
      int viewMyTweet(Tweet tweet)throws SQLException;
      int deleteTweet();
      //List<Tweet> viewAllTweet(Tweet tweet);
	  int addNewTweet(Tweet tweet) throws SQLException;
      
}
