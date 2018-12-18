package fr.ensai.simpleAppWithAOP.aspects;

import java.util.Random;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {
	@Around("execution(* *..*Bank.*(..))")
	public Object authentification(ProceedingJoinPoint pjp) {
//		int l = new Random().nextInt(100);
		//System.err.println(l);
//		if (l > 50)
//			try {
				try {
					pjp.proceed();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return false;
/*			} catch (Throwable e) {
				e.printStackTrace();
			}
		return false;*/
	}
}
