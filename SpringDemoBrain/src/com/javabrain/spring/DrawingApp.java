package com.javabrain.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
//		Triangle traingle = new Triangle();
		
//		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle traingle = (Triangle)beanFactory.getBean("triangle");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Triangle traingle = (Triangle)applicationContext.getBean("triangle");
		
		
		
		traingle.draw();
		

	}

}
