package spring.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("spring.AOP.aspects.MyPointcuts.allGetAndAddMethods()")
    public void BeforeGetAddExceptionHandlingAspect(){
        System.out.println("BeforeGetAddExceptionHandlingAspect: Catching/handling exceptions when trying to get/add book or magazine");
    }



}
