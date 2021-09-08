package spring.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    //join point example
    @Before("spring.AOP.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("BeforeAddExceptionHandlingAdvice: Catching/handling exceptions when trying to add book or magazine");
        System.out.println("__________________________________________________________________________________________________________");
    }

//    @Before("spring.AOP.aspects.MyPointcuts.allGetAndAddMethods()")
//    public void beforeGetAddExceptionHandlingAspect(){
//        System.out.println("BeforeGetAddExceptionHandlingAspect: Catching/handling exceptions when trying to get/add book or magazine");
//        System.out.println("__________________________________________________________________________________________________________");
//    }



}
