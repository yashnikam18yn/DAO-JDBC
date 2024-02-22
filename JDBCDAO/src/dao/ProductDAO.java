package dao;

import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {
   int insert(Product product) throws SQLException;
   List<Product> viewAll() throws SQLException;
   int delete(Product product) throws SQLException;
}
