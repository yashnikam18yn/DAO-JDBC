package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TestProductDAOimpl {
	public static void main(String[] args) throws SQLException {
		ProductDAOimpl productdaoimpl = new ProductDAOimpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Insert\n2.Display\n3.delete");
		System.out.println("Enter YOur Choice-");
		int ch = sc.nextInt();
		Product p1 = new Product(0,"note",123);
		//Product p2 = new Product(4,"",0);
		
		switch(ch) {
		case 1:productdaoimpl.insert(p1);
		break;
		
		
		case 2:System.out.println(productdaoimpl.viewAll());
		break;
		
//		case 3:int res = productdaoimpl.delete(p2);
//		System.out.println("Deleted "+res);
//		break;
		
		}
		
		
		
		
		
		
		
		
		
		
	}
}
