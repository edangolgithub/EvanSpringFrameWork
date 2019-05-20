package chandra;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain1 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cntext= new ClassPathXmlApplicationContext("Student.xml");
		
		Student sm= (Student) cntext.getBean("st");
		
		System.out.println(sm.id);
		System.out.println(sm.name);
		System.out.println(sm.Address.City);
for (String string : sm.subjects) {
	System.out.println(string);
}
		
		
	}

}
