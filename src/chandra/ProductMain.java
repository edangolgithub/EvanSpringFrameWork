package chandra;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ct= new ClassPathXmlApplicationContext("product.xml");
		Productdao dao=(Productdao) ct.getBean("pd");
		System.out.println("before update");
		System.out.println("_______________");
		for (Product p1 : dao.SelectRowmapper()) {
			System.out.println(p1.productname);
		}
		Product p = new Product();
		p.productid=6;
		p.productname="coca cola";
		p.price=500;
		dao.update(p);
		System.out.println("after update");
		System.out.println("______________");
		for (Product p1 : dao.SelectRowmapper()) {
			System.out.println(p1.productname);
		}
	}

}
