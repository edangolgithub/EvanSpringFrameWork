package evan.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.Listclassbean;

public class Listmain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("list.xml");
Listclassbean lbean=(Listclassbean)context.getBean("listbean");
for (String country : lbean.getCountries()) {
	System.out.println(country);
}

	}

}
