package chandra;

import java.util.List;

import javax.security.auth.Subject;


public class Faculty {
	
int facultyid;
String facultyname;
List<String> subjects;
public Faculty(int facultyid, String facultyname, List<String> subjects) {
	super();
	this.facultyid = facultyid;
	this.facultyname = facultyname;
	this.subjects = subjects;
}

}
