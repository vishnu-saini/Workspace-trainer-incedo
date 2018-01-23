package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AudienceAdvice2 {
	
	//@Before("execution(* *.*(..))")
	public void myBeforeMethod(JoinPoint j){
		System.out.println("called Before method nameOfTheMethod:"+j.getSignature().getName());
	}
	//will execute whether their exception or not
	//@After("execution(* *.*(..))")
	public void myAfterMethod(JoinPoint j){
		System.out.println("called After method nameOfTheMethod:"+j.getSignature().getName());
	}
	
	//only executed if method successfully returns!
	//we can get return value

	//@AfterReturning("execution(* *.*(..))")
	public void myAfterReturningMethod(JoinPoint j){
		System.out.println("called after method return nameOfTheMethod:"+j.getSignature().getName());
	}


	//@AfterThrowing("execution(* *.*(..))")
	public void myAfterThrowingMethod(JoinPoint j){
		System.out.println("called after method throws an exception nameOfTheMethod:"+j.getSignature().getName());
	}
}