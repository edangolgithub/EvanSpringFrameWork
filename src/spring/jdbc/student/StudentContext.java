package spring.jdbc.student;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentContext
	{

		public static void main(String[] args)
			{
				ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("studentjdbc.xml");
				StudentDao da=(StudentDao)con.getBean("edao");
				for (Map<String, Object> student :da.listStudents())
					{
						//System.out.println(student.get("studentname"));
					}
				
				
				for (Student st : da.GetStudentListWithRowMapper())
					{
						System.out.println(st.getStudentname());
					}

			}

	}
