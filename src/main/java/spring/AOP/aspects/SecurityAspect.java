package spring.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("spring.AOP.aspects.MyPointcuts.allGetMethods()")
    public void beforeAllGetActionsSecurityAdvice() {
        System.out.println("BeforeAllGetActionsSecurityAdvice: Checking the rights to get book/magazine");
    }



}
