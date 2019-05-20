package chandra;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cntext= new ClassPathXmlApplicationContext("studentmanager.xml");
		
		StudentManager sm= (StudentManager) cntext.getBean("sm");
		System.out.println(sm.Student.name);
		System.out.println(sm.semeseter.sem);
		System.out.println(sm.semeseter.durationinmnths);

	}

}
