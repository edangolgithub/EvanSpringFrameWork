package chandra;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import spring.jdbc.student.Student;

public class Productdao 
{
JdbcTemplate jt;
DataSource ds;
public JdbcTemplate getJt() {
	return jt;
}
public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
public DataSource getDs() {
	return ds;
}
public void setDs(DataSource ds) {
	this.ds = ds;
	jt= new JdbcTemplate(ds);
}

public boolean insert(Product p)
{
	String query="insert into product values(?,?,?)";
	if(jt.update(query,p.productid,p.productname,p.price)==1)
	{
		return true;
	}
	else
	{
		return false;
	}
}

public List<Product> SelectRowmapper()
{
	String sql="select * from Product"; 
	 
	 
	 List<Product> products=jt.query(sql,new Productrowmapper());
	 return products;
}


}

