package spring.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointcuts {

    @Pointcut("execution(* *(..))") //  Pointcut declaration - такое логгирование будет отрабатывать перед всеми методами
    public void allMethods() {} // private меняем на public


    @Pointcut("execution(* get*(..))")
    public void allGetMethods(){}

    @Pointcut("execution(* add*(..))|| allGetMethods()")
    public void allGetAndAddMethods(){}

    @Pointcut("execution(* *(..)) && !allReturnMethods())")
    public void withoutReturnMethods(){}


//    @Pointcut("execution(* spring.AOP.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
    @Pointcut("execution(* return*())")
    private void allReturnMethods() {
    }
//
//    @Before("allReturnMethodsToTheUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: Trying to return a book/magazine to the UniLibrary");
//    }
//
//    @Pointcut("execution(void spring.AOP.*.add*())")
//    private void allAddMethods() {}
//
//    @Before("allAddMethods()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: Logging an attempt to add a book/magazine");
//    }


}
