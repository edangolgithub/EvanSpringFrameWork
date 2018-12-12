package evan.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evan.beans.Address;
import evan.beans.AddressListBean;

public class Addresslist {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("addresslist.xml");
		AddressListBean bean=(AddressListBean) context.getBean("al");
		
		System.out.println(bean.getId());
		
		for (Address Address : bean.getAddresses()) {
			System.out.println(Address.toString());
			/*System.out.println(Address.getCity());
			System.out.println(Address.getState());
			System.out.println(Address.getCountry());*/
			System.out.println("---------------------------------");
		}

	}

}
