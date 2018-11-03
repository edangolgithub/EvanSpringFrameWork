package evan.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student st=(Student) context.getBean("sbean");
        System.out.println(st.getName());
     
	}

}
