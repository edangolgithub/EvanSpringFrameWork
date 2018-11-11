package spring.jdbc.student;

public class Student
	{
		int studentid;
		String studentname;
		String roll;
		String grade;

		public int getStudentid()
			{
				return studentid;
			}

		public void setStudentid(int studentid)
			{
				this.studentid = studentid;
			}

		public String getStudentname()
			{
				return studentname;
			}

		public void setStudentname(String studentname)
			{
				this.studentname = studentname;
			}

		public String getRoll()
			{
				return roll;
			}

		public void setRoll(String roll)
			{
				this.roll = roll;
			}

		public String getGrade()
			{
				return grade;
			}

		public void setGrade(String grade)
			{
				this.grade = grade;
			}
public Student()
{
	
}
		public Student(String studentname, String roll, String grade)
			{
				super();
				this.studentname = studentname;
				this.roll = roll;
				this.grade = grade;
			}
	}
