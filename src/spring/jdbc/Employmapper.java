package spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class Employmapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	    Employee student = new Employee();
	    student.setId(rs.getInt("number"));
	    student.setName(rs.getString("name"));
	    student.setSalary(rs.getInt("salary"));
	    
	    return student;
	 }
	

}
