package evan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.Employee;

public class EmployeeContext {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
Employee emp=(Employee) context.getBean("e");
System.out.println(emp.getAddress().toString());
Employee emp1=(Employee) context.getBean("e1");
emp1.showaddresses();

	}

}
