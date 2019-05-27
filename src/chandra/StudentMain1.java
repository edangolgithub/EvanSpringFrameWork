package chandra;

import java.util.*;

import javax.security.auth.Subject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain1 {

	public static void main(String[] args) {

		List<Faculty> fs = new ArrayList<Faculty>();

		Faculty management = new Faculty();

		Subjects s = new Subjects();
		s.subid = 1;
		s.subname = sub.cimputer;
		Subjects s1 = new Subjects();
		s1.subid = 1;
		s1.subname = sub.nepali;
		Subjects s2 = new Subjects();
		s2.subid = 1;
		s2.subname = sub.account;
		
		management.facultyid = 1;
		management.facultyname = "Management";
		management.subjects= new ArrayList<Subjects>();
		management.subjects.add(s);
		management.subjects.add(s1);
		management.subjects.add(s2);
		
		
		
		Faculty cs = new Faculty();

		Subjects s4 = new Subjects();
		s4.subid = 1;
		s4.subname = sub.cimputer;
		Subjects s5 = new Subjects();
		s5.subid = 1;
		s5.subname = sub.nepali;
		Subjects s6 = new Subjects();
		s6.subid = 1;
		s6.subname = sub.english;
		cs.facultyid = 2;
		
		cs.facultyname = "Computer Science ";
		cs.subjects= new ArrayList<Subjects>();
		cs.subjects.add(s4);
		cs.subjects.add(s5);
		cs.subjects.add(s6);
		
		fs.add(management);
		fs.add(cs);
		
		
	  for (Faculty faculty : fs) {
		  System.out.println("---------------------------");
		System.out.println(faculty.facultyname);
		
		for (Subjects subject : faculty.subjects) {
			System.out.println(subject.subname);
		}
		 System.out.println("---------------------------");
		
	}
		
	}

}
