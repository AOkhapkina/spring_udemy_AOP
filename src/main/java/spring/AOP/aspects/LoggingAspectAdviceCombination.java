package spring.AOP.aspects;
/*
Комбинирование Pointcut-ов–это их объединение с помощью логических операторов && || !
execution( modifiers-pattern? return-type-pattern declaring-type-pattern?
method-name-pattern(parameters-pattern)throws-pattern? )
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectAdviceCombination {

//    @Pointcut("execution(* spring.AOP.UniLibrary.*(..))")
//    private void allMethodsOfUniLibrary() {}
//
//    @Before("allMethodsOfUniLibrary()")
//    private void beforeUsingLoggingAdvice() {
//        System.out.println("beforeUsingLoggingAdvice: Logging an attempt to use the UniLibrary");
//    }
//    @Pointcut("allMethodsOfUniLibrary() && ! allAddMethods()")
//    private void allMethodsOfUniLibraryWithoutAddMethod() {}
//
//    @Before("allMethodsOfUniLibraryWithoutAddMethod()")
//    public void beforeAllMethodsOfUniLibraryWithoutAddLoggingAdvice(){
//        System.out.println("beforeAllMethodsOfUniLibraryWithoutAddLoggingAdvice(): Log#1");
//    }

//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsToTheUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: Trying to get/return a book/magazine from/to the UniLibrary");
//    }
//
//    @Pointcut("execution(* spring.AOP.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: Trying to get a book/magazine from the UniLibrary");
//    }
//
//    @Pointcut("execution(* spring.AOP.UniLibrary.return*())")
//    private void allReturnMethodsToTheUniLibrary() {
//    }
//
//    @Before("allReturnMethodsToTheUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: Trying to return a book/magazine to the UniLibrary");
//    }

//    @Pointcut("execution(void spring.AOP.*.add*())")
//    private void allAddMethods() {}
//
//    @Before("allAddMethods()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: Logging an attempt to add a book/magazine");
//    }
//
//     @Pointcut("execution(* *(..))") //  Pointcut declaration - такое логгирование будет отрабатывать перед всеми методами
//     private void allMethods() {}

//    @Before("allMethods()")
//    public void beforeAllActionSecurityAdvice() {
//        System.out.println("beforeAllActionSecurityAdvice: Checking the rights to use the library");
//    }


}
