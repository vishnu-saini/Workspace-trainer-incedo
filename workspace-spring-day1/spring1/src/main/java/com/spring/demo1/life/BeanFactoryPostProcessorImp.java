package com.spring.demo1.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;

public class BeanFactoryPostProcessorImp implements ApplicationContextAware{

	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		
		((AbstractApplicationContext )ctx).registerShutdownHook();
	}

/*	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory fac)
		throws BeansException {
		
	}*/

}