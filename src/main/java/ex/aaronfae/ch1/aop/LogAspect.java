package ex.aaronfae.ch1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Around("execution(* ex.aaronfae.ch1.aop.DemoMethodService.*(..))")
    public void Log(ProceedingJoinPoint pjp) {
        try {
            System.out.println("log...start");
            pjp.proceed();
            System.out.println("log...end");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Before("@annotation(ex.aaronfae.ch1.aop.AnnotationForAspect)")
    public void Log(){
        System.out.println("开始织入...被AnnotationForAspect注解的方法");
    }
}
