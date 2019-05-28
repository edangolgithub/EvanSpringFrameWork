package chandra;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Productrowmapper implements RowMapper<Product>
{

	@Override
	public Product mapRow(ResultSet rs, int arg1) throws SQLException {
		int id=rs.getInt("productid");
		String productname=rs.getString("productname");
		double price=rs.getDouble("price");
		
		Product p= new Product();
		p.productid=id;
		p.productname=productname;
		p.price=price;
		
		return p;
	}
	
}
