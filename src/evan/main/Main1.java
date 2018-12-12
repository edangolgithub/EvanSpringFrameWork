package evan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.Student;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        
		Student s=(Student) context.getBean("sbean");
      System.out.print(s.getName());
      System.out.print(s.getA());
	}

}
