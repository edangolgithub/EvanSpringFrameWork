package spring.jdbc.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao
	{
		private JdbcTemplate jdbcTemplate;
		private DataSource dataSource;
		
		private List<Student> slist;

		public JdbcTemplate getJdbcTemplate()
			{
				return jdbcTemplate;
			}

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
			{
				this.jdbcTemplate = jdbcTemplate;
			}

		public DataSource getDataSource()
			{
				return dataSource;
			}

		public void setDataSource(DataSource dataSource)
			{
				this.dataSource = dataSource;
				this.jdbcTemplate=new JdbcTemplate(dataSource);
			}
		
		
		
		
		public List<Student> GetStudentListWithRowMapper()
			{
			 String sql="select * from Student";
			 
			 
			 
			 List<Student> slt=jdbcTemplate.query(sql,new RowMapper<Student>() {

				@Override
				public Student mapRow(ResultSet rs, int arg1) throws SQLException {
					
					int id=rs.getInt("studentid");
					String name=rs.getString("studentname");
					String roll=rs.getString("roll");
					String grade=rs.getString("grade");
					
					Student s= new Student();
					s.setStudentid(id);
					s.setStudentname(name);
					s.setRoll(roll);
					s.setGrade(grade);
					return s;
				}});
			 
			/* List<Student> slist=jdbcTemplate.query(sql, new RowMapper<Student>() {

				@Override
				public Student mapRow(ResultSet rs, int rownum) throws SQLException
					{
						Student s= new Student(rs.getString("studentname"), rs.getString("roll"), rs.getString("grade"));						
						return s;
					}});*/
			 
			 
			 this.slist=slt;
			 return this.slist;
			}
		
		public List<Student> GetStudentListWithResultSetExtractor()
		{
			  String SQL = "select * from Student";
			  List<Student> slt=new ArrayList<Student>();
			  slt=jdbcTemplate.query(SQL,new ResultSetExtractor<List<Student>>() {

				@Override
				public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
					List<Student> slt=new ArrayList<Student>();
					while(rs.next())
					{
						int id=rs.getInt("studentid");
						String name=rs.getString("studentname");
						String roll=rs.getString("roll");
						String grade=rs.getString("grade");
						
						Student s= new Student();
						s.setStudentid(id);
						s.setStudentname(name);
						s.setRoll(roll);
						s.setGrade(grade);
						
						slt.add(s);
					}
					
					return slt;
				}});
			  
			  this.slist=slt;
			  
			 /*setSlist(jdbcTemplate.query(SQL, new ResultSetExtractor<List<Student>>() {

					@Override
					public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException
						{
							List<Student> slist=new ArrayList<Student>();
						while(rs.next())
							{
							Student s= new Student(rs.getString("studentname"), rs.getString("roll"), rs.getString("grade"));
							slist.add(s);
							}
						return slist;
						}}));*/
			 return slist;
		}
		public List<Map<String,Object>> listStudents() {
		
		    String SQL = "select * from Student";
		   List<Map<String,Object>> st=  jdbcTemplate.queryForList(SQL);
		  
		    return st;
		 }

		public List<Student> getSlist()
			{
					return slist;
			}

		public void setSlist(List<Student> slist)
			{
					this.slist = slist;
			}

	}
