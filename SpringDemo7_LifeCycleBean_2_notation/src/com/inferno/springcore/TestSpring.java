package com.inferno.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		((AbstractApplicationContext)applicationContext).registerShutdownHook();
		
		Restuarant restuarant = (Restuarant) applicationContext.getBean("restuarantBean");				
				
		restuarant.greetCustomer();

	}

}
