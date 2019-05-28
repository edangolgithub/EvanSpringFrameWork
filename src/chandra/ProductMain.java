package chandra;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ct= new ClassPathXmlApplicationContext("product.xml");
		Productdao dao=(Productdao) ct.getBean("pd");
		
		for (Product p : dao.SelectRowmapper()) {
			System.out.println(p.productname);
		}
	}

}
