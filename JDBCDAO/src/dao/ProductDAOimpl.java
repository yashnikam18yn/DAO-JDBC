package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOimpl implements ProductDAO {

	private Connection conn;
	public ProductDAOimpl() {
		 conn=DBUtil.getConnection();
	}
	
	@Override
	public int insert(Product product) throws SQLException {
		// TODO Auto-generated method stub
		String sql ="insert into PRODUCTS(product_name,product_price)values(?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, product.getName());
        pst.setInt(2, product.getPrice());
        
        
        int res = pst.executeUpdate();
        System.out.println("Inserted Sucessful-"+res);
		return res;
	}
	

	@Override
	public List<Product> viewAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Product> product = new ArrayList<>();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from PRODUCTS");
		System.out.println("Id\tName\t\tPrice");
		System.out.println("---------------------");
		while(rs.next()) {
			Product pro = new Product(); 
			pro.setId(rs.getInt(1));
			pro.setName(rs.getString(2));
			pro.setPrice(rs.getInt(3));
			
			product.add(pro);
			
		}
		return product;
	}
	
	public int delete(Product product) throws SQLException {
		String sql = "delete from PRODUCTS where product_id=?";
		
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, product.getId());
		
		int res = pst.executeUpdate();
		
		return res;
		
		
	}
 
}
