package spring.jdbc;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;




public class EmployeeDao 
{
private JdbcTemplate jdbcTemplate;
private DataSource dataSource;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
    this.jdbcTemplate = new JdbcTemplate(dataSource);
 }
public DataSource getDataSource() {
	return dataSource;
}
public int saveEmployee(Employee e){
	String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
	return jdbcTemplate.update(query);
}

public int saveEmployeeprep(Employee e){
	String query="insert into employee (name,salary)values(?,?)";
	return jdbcTemplate.update(query,e.getName(),e.getSalary());
}
public int updateEmployee(Employee e){
	String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";
	return jdbcTemplate.update(query);
}
public int deleteEmployee(Employee e){
	String query="delete from employee where id='"+e.getId()+"' ";
	return jdbcTemplate.update(query);
}


public List<Employee> listStudents() {
	
	
    String SQL = "select * from Employee";
    List <Employee> es = (List<Employee>) jdbcTemplate.query(SQL, new Employmapper());
    return es;
 }




}
