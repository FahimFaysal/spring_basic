package com.inferno.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restuarant {

	public void greetCustomer() {
		System.out.println("This is life cycle test");
	}

	@PostConstruct
	public void init() {
		System.out.println("i'm going init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("bean going to destroy");
	}
}
