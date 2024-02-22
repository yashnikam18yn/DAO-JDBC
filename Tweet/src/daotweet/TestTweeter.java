package daotweet;

import java.sql.SQLException;
import java.util.Scanner;

public class TestTweeter {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		UserDAOImpl userdaoimpl = new UserDAOImpl();
		TweetDAOImpl tweetdaoimpl = new TweetDAOImpl();
		

		// --------Tweeet-----------
		// 1.new Tweet
		
		// 2. my tweet
		
		while(true) {
			System.out.println("---Welcome User---");
			System.out.println("1.SignUp\n2.SignIn\n3.View Profile\n4.New Tweet\n5.My Tweets");
			System.out.println("Enter Choice");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Id-");
				int uid =sc.nextInt();
				System.out.println("Enter Name");
				String uname = sc.next();
				System.out.println("Enter Email");
				String uemail = sc.next();
				System.out.println("Enter Password");
				String upass = sc.next();
				System.out.println("Enter Bio");
				String ubio = sc.next();
				System.out.println("Avtar Path");
				String uavtar = sc.next();
				User user1 = new User(uid, uname, uemail, upass, ubio, uavtar);
				userdaoimpl.signUp(user1);
				break;

			case 2:
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter Email-");
				String email = sc.next();
				System.out.println("Enter password-");
				String pass = sc.next();
				User user2 = new User(id, "", email, pass, "", "");
				userdaoimpl.signIn(user2);
				break;

			case 3:
				System.out.println("Enter Id-");
				int pid=sc.nextInt();
				User user3 = new User(pid, "", "", "", "", "");
				userdaoimpl.viewProfile(user3);
				break;

			case 4:
				System.out.println("EnterId");
				int tid = sc.nextInt();
				System.out.println("Write Tweet Body");
				String tbody =sc.next();
				System.out.println("Enter UserId");
				int utid=sc.nextInt();
				
				Tweet tweet1 = new Tweet(tid, tbody, utid, 1);
				tweetdaoimpl.addNewTweet(tweet1);
				break;

			case 5:
				System.out.println("Enter UserId");
				int umtid = sc.nextInt();
				Tweet tweet2 = new Tweet(1, "", umtid, 2);
				tweetdaoimpl.viewMyTweet(tweet2);
				break;

			}
		}

		

	}
}
