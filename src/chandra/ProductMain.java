package chandra;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ct= new ClassPathXmlApplicationContext("product.xml");
		Productdao dao=(Productdao) ct.getBean("pd");
		Product p= new Product();
		p.productname="kripaa";
		p.price=100;
		dao.insert(p);
	}

}
