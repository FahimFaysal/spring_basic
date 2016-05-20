package com.inferno.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorClass1 implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanPostProcessorClass1 processing bean instance after intialization (i.e. just after init life cycle even) of: "+arg0);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanPostProcessorClass1 processing bean instance before intialization (i.e. after spring instantiates bean and before init life cycle even) of: "+arg0);
		return arg0;
	}

}
