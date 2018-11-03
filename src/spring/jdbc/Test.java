package spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		
		
		List<Employee> es=dao.listStudents();
		
		for (Employee employee : es) {
			System.out.println(employee.getName());
		}
		Employee e= new Employee();
		e.setName("kris");
		e.setSalary(123);
		int res=dao.saveEmployee(e);
		System.out.println(res);
		//int status=dao.saveEmployee(new Employee("p",35000));
		//System.out.println(status);
		
		/*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
		System.out.println(status);
		*/
		
		/*Employee e=new Employee();
		e.setId(102);
		int status=dao.deleteEmployee(e);
		System.out.println(status);*/
		
	}

}
