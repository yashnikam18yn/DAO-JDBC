package daotweet;

public class User {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userBio;
    private String userAvtar;
    
    public User() {
    	
    }

	public User(int userId, String userName, String userEmail, String userPassword, String userBio, String userAvtar) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userBio = userBio;
		this.userAvtar = userAvtar;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserBio() {
		return userBio;
	}

	public void setUserBio(String userBio) {
		this.userBio = userBio;
	}

	public String getUserAvtar() {
		return userAvtar;
	}

	public void setUserAvtar(String userAvtar) {
		this.userAvtar = userAvtar;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userBio=" + userBio + ", userAvtar=" + userAvtar + "]";
	}
    
    
    
    
}
