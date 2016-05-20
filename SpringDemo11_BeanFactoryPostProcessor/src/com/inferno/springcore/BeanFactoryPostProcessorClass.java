package com.inferno.springcore;

import javax.swing.text.MutableAttributeSet;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorClass implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)throws BeansException {
		// TODO Auto-generated method stub
		BeanDefinition beanDefinition =  configurableListableBeanFactory.getBeanDefinition("restuarantBean");
		MutablePropertyValues mutablePropertyValues = beanDefinition.getPropertyValues();
		
		mutablePropertyValues.addPropertyValue("welcomeNote", "this is modifyed wecome note ");
		
	}

}
