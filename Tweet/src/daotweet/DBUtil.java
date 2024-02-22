package daotweet;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
private static Connection conn;
	
	private DBUtil() {
		
	}
	
	public static Connection getConnection() {
		return conn;
		
	}
	
	
	static {
		
		try {
			Class.forName("org.h2.Driver");
			System.out.println("Loaded...");
			
			conn = DriverManager.getConnection("jdbc:h2:~/test","sa","1234");
			System.out.println("Connected....");
		}catch(Exception e) {
			e.printStackTrace();	
			
		}
		
	}
}
