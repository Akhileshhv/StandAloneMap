package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		 com.ty.customer customer=(customer) context.getBean("mycustomer");
		 
		 
		 System.out.println(customer.getBanks().getClass().getName());
		 System.out.println((customer.getPhnoloc().getClass().getName()));
		 System.out.println(customer);
	}

}
