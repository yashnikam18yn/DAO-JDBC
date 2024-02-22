package daotweet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TweetDAOImpl implements TweetDAO {

	
	private Connection conn;
	
	public TweetDAOImpl() {
		conn=DBUtil.getConnection();
	}
	
	@Override
	public int addNewTweet(Tweet tweet) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into tweets(tid,tbody,uid,likes)values(?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, tweet.getTweetId());
		pst.setString(2, tweet.getTweetBody());
		pst.setInt(3,tweet.getUserId());
		pst.setInt(4, tweet.getLikes());
		int rs = pst.executeUpdate();
		System.out.println("New Tweet Added Sucessfull"+rs);
		return 0;
	}

	@Override
	public int viewMyTweet(Tweet tweet) throws SQLException {
		// TODO Auto-generated method stub
	    String sql = "select * from tweets where uid=?";
	    PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, tweet.getUserId());
		
		ResultSet res = pst.executeQuery();
		System.out.println("-----My Tweets-----");
		
		while(res.next()) {
			System.out.println("Tweet Id:"+res.getInt(1));
			System.out.println("Body"+res.getString(2));
		}
		return 0;
	}

	@Override
	public int deleteTweet() {
		// TODO Auto-generated method stub
		return 0;
	}

	//@Override
//	public List<Tweet> viewAllTweet() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	public int viewAllTweet(Tweet tweet) throws SQLException {
		
		
		Statement st = conn.createStatement();
		
		return 0;
	}

}
