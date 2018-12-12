package evan.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.Teacher;

public class Teachermain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("teacher.xml");
		Teacher t= (Teacher) context.getBean("teacher");
		
		System.out.print(t.getTeacherName());
		System.out.print(t.getAddress().getAddress());
	}

}
