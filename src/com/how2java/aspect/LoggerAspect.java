package com.how2java.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
//qqqq
@Aspect
@Component
public class LoggerAspect { 
	@Around(value = "execution(* com.how2java.service.ProductService.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("start log:" + joinPoint.getSignature().getName());
		Object object = joinPoint.proceed();
		System.out.println("end log:" + joinPoint.getSignature().getName());
		System.out.println("这是我修改的文件");
		return object;
	}
}
