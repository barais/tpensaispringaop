package fr.ensai.simpleAppWithAOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
	@AfterReturning("execution(* *..*Store.*(..))")
	public void log(JoinPoint pjp){
		System.out.println("will call " + pjp.toLongString());		
	}
}
