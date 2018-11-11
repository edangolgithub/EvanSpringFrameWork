package evan.beans;

public class Course 
{
  private String CourseName;

public String getCourseName() {
	return CourseName;
}

public Course(String courseName) {
	super();
	CourseName = courseName;
}

public void setCourseName(String courseName) {
	CourseName = courseName;
}
}
