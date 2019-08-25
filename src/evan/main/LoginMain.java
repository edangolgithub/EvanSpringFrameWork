package evan.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.Login;

public class LoginMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("login.xml");
		Login l= (Login) context.getBean("l");
		
		
		
		System.out.println(l.getUsername());
		System.out.println(l.getPassword());

	}

}
