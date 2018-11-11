package evan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.Question;

public class Questionmain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("question.xml");
		Question q=(Question)context.getBean("q");
		q.displayInfo();

	}

}
