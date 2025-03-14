package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	
		
		//IOC STARTS
		
	ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
				
		//getBean()
				
	Car c1=con.getBean("car1",Car.class);
				

	}

}
