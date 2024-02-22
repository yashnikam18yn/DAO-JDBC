package daotweet;

import java.sql.SQLException;

public interface UserDAO {
	int signUp(User user) throws SQLException;
	int signIn(User user) throws SQLException;
	String viewProfile(User user) throws SQLException;
	
}
