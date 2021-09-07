package spring.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

@Before("spring.AOP.aspects.MyPointcuts.allMethods())")
    public void beforeAllActionsLoggingAspect(){
    System.out.println("beforeAllActionsLoggingAspect: Logging an attempt to use library");
}
}
