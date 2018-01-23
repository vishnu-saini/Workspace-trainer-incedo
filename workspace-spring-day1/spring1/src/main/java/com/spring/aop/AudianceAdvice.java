package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


//Aspect=point cut+ extra logic to be applied
@Aspect
//@Component
public class AudianceAdvice {
	@Before("execution(public void doMagic())")
	public void clapping(JoinPoint joinpoint){
		System.out.println("clap clap.....");
		System.out.println("information of target method :"+joinpoint.getSignature().getName());
	}
}
