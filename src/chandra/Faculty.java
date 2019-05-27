package chandra;

import java.util.List;

import javax.security.auth.Subject;

public class Faculty {

	int facultyid;
	String facultyname;
	List<Subjects> subjects;

	public Faculty() {
		super();
	}

	public Faculty(int facultyid, String facultyname, List<Subjects> subjects) {
		super();
		this.facultyid = facultyid;
		this.facultyname = facultyname;
		this.subjects = subjects;
	}

}
