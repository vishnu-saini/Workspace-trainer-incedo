package com.spring.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class AudienceAdvice {
	@Around("execution(* *.*(..))")
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("before logic called");

		Object result = pjp.proceed();

		System.out.println("after logic called");
		return result;

	}
}