package com.example.proxypattern.ex1.service;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Log4j2
@Component // bean 등록
@Aspect
@EnableAspectJAutoProxy
public class PerfAspect {
//	@Around("execution(* com.example.proxypattern.ex1.service.EventService.*(..))")
//	@Around("bean(testEventService)")
	@Around("@annotation(PerfLogging)")
	public Object logPerf(ProceedingJoinPoint joinPoint) throws Throwable {
		long begin = System.currentTimeMillis();
		Object retVal = joinPoint.proceed(); // target에 해당하는 메서드를 호출
		log.info(System.currentTimeMillis() - begin);
		return retVal;
	}

//	@Before("bean(testEventService)")
	@Before("@annotation(PerfLogging)")
	public void hello() {
		log.info("hello");
	}
}
