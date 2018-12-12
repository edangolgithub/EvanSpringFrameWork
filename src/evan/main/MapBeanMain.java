package evan.main;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.MapBean;

public class MapBeanMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("mapbean.xml");
		MapBean bean=(MapBean) context.getBean("q");
		
		for (Map.Entry<String,String> dict : bean.getDictionary().entrySet()) 
		{
			System.out.println(dict.getKey()+"==>"+dict.getValue());
		}
		
		
	}

}
