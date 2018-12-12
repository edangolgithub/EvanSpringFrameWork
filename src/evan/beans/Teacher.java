package evan.beans;

public class Teacher 
{
String TeacherName;
TeacherAddress address;
public Teacher() {
	super();
}
public Teacher(String teacherName, TeacherAddress address) {
	super();
	TeacherName = teacherName;
	this.address = address;
}
public String getTeacherName() {
	return TeacherName;
}

public void setTeacherName(String teacherName) {
	TeacherName = teacherName;
}
public TeacherAddress getAddress() {
	return address;
}
public void setAddress(TeacherAddress address) {
	this.address = address;
}

}
