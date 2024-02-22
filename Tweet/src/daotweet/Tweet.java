package daotweet;

public class Tweet {
    private int tweetId;
    private String tweetBody;
    private int userId;
    private int likes;
    
    //User user;
    
    public Tweet(){
    	
    }

	public Tweet(int tweetId, String tweetBody, int userId, int likes) {
		super();
		this.tweetId = tweetId;
		this.tweetBody = tweetBody;
		this.userId = userId;
		this.likes = likes;
		//this.user=user;
	}
	
	

	public int getTweetId() {
		return tweetId;
	}

	public void setTweetId(int tweetId) {
		this.tweetId = tweetId;
	}

	public String getTweetBody() {
		return tweetBody;
	}

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "Tweet [tweetId=" + tweetId + ", tweetBody=" + tweetBody + ", userId=" + userId + ", likes=" + likes
				+ "]";
	}
    
	
   
}
