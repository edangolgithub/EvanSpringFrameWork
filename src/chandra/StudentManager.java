package chandra;

public class StudentManager
{
 Student Student;
 Semester semeseter;
 Faculty faculty;
 
public StudentManager(Student student, Semester semeseter, Faculty faculty) {
	super();
	Student = student;
	this.semeseter = semeseter;
	this.faculty = faculty;
}
public Student getStudent() {
	return Student;
}
public void setStudent(Student student) {
	Student = student;
}
public Semester getSemeseter() {
	return semeseter;
}
public void setSemeseter(Semester semeseter) {
	this.semeseter = semeseter;
}
public Faculty getFaculty() {
	return faculty;
}
public void setFaculty(Faculty faculty) {
	this.faculty = faculty;
}
 public void showaddress()
 {
	 
 }
 public void showsemesetr()
 {
	 
 }
 public void showsubjects()
 {
	 
 }
 public void showfaculty()
 {
	 
 }
 public void showinf()
 {
	 System.out.println(Student.id);
	 System.out.println(Student.name);
	 System.out.println(Student.Address.City);
	 
 }
 
}
