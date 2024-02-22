package daotweet;
//java -jar h2-2.2.224.jar
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDAOImpl implements UserDAO {
	Scanner sc = new Scanner(System.in);
	private Connection conn;
	
	public UserDAOImpl() {
		conn=DBUtil.getConnection();
	}

	@Override
	public int signUp(User user) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "insert into users(uid,uname,uemail,upassword,ubio,uavtar)values(?,?,?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setInt(1, user.getUserId());
		pst.setString(2, user.getUserName());
		pst.setString(3, user.getUserEmail());
		pst.setString(4, user.getUserPassword());
		pst.setString(5, user.getUserBio());
		pst.setString(6, user.getUserAvtar());
		
		int res = pst.executeUpdate();
        System.out.println("SignUp successful -"+res);
		return res;
	}

	@Override
	public int signIn(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select uemail,upassword from users where uemail=? and upassword=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setString(1, user.getUserEmail());
		pst.setString(2,user.getUserPassword());
		
		
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()) {
			System.out.println("User Exist..");
			
		}else
		{
			System.out.println("Check Your Email or Password");
		}
		
		return 0;
		
	}

	@Override
	public String viewProfile(User user) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "select * from users where uid=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, user.getUserId());
		
		ResultSet res = pst.executeQuery();
		System.out.println("-----Profile-----");
		
		while(res.next()) {
			System.out.println("userId"+res.getInt(1));
			System.out.println("Name"+res.getString(2));
			System.out.println("Email"+res.getString(3));
//			System.out.println("userId"+res.getString(4));
			System.out.println("Bio"+res.getString(5));
			System.out.println("Avtar"+res.getString(6));
					
		}
		
		
		return null;
	}
	
}
