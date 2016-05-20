package com.inferno.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restuarant implements InitializingBean, DisposableBean {

	public void greetCustomer() {
		System.out.println("This is life cycle test");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("here i'm 1st");

	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("going to destory bean");

	}

}
