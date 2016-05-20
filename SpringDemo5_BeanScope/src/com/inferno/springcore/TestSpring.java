package com.inferno.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"SpringConfig.xml");

		Restuarant restuarant1 = (Restuarant) applicationContext.getBean("restuarantBean");
		restuarant1.setWelcomeNote("welcome to Inferno");
		restuarant1.greetCustomer();

		
		Restuarant restuarant2 = (Restuarant) applicationContext.getBean("restuarantBean");
		restuarant2.setWelcomeNote("Back ot inferno");
		restuarant2.greetCustomer();
		restuarant1.greetCustomer();
	}

}
