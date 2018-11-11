package evan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.Question;
import evan.beans.Student;

public class StuCoursemain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("stucousre.xml");
		Student q=(Student)context.getBean("st");
		
		q.displayInfo();
	}

}
