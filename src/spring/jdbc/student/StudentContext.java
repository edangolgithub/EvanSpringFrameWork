package spring.jdbc.student;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentContext
	{

		public static void main(String[] args)
			{
				ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("studentjdbc.xml");
				StudentDao da=(StudentDao)con.getBean("edao");
				
				List<Map<String,Object>> data= da.listStudents();
				
				for (Map<String, Object> map : data) {
					System.out.println(map.get("roll"));
				}
				
				/*for (Map<String, Object> student :da.listStudents())
					{
						//System.out.println(student.get("studentname"));
					}*/
				
				List<Student> slist= da.GetStudentListWithResultSetExtractor();				
			
for(Student s :slist)
{
	System.out.print(s.getStudentid());
	System.out.print(s.getStudentname());
	System.out.print(s.getGrade());
	System.out.print(s.getRoll());
	System.out.println();
}
				
				
			}

	}
