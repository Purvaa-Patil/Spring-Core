package edu.jsp.diSetter.test;

import java.security.KeyStore.Entry;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.diSetter.bean.Shop;

public class ShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("shopconfig.xml");
		
		Shop shop =(Shop) context.getBean("Shop");
		
		System.out.println("Shop ID : "+shop.getId());
		System.out.println("Shop Name : "+shop.getName());
		System.out.println("------------------------------------");
		Map<String , String> items = shop.getItems();
		
		for (java.util.Map.Entry<String, String> entry : items.entrySet()) {
			System.out.println(entry.getKey()+" , "+entry.getValue());
		}
		
	}

}
