package evan.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.Person;
import evan.beans.Phone;

public class PersonMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("person.xml");
		
		Person p= (Person) context.getBean("p");
		System.out.println(p.getName());
		System.out.println(p.getId());
		
		for (String string : p.getNicknames()) {
			System.out.println(string);
		}
		System.out.println("phones");
		System.out.println("---------------");
		for (Phone phones : p.getPhones()) {
			System.out.println(phones.getNumber());
		}
		
		
	}

}
