package evan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.Employee;
import evan.beans.PartEmployee;

public class partemployeemain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("partemployee.xml");
		PartEmployee pemp=(PartEmployee) context.getBean("p1");
	}

}
