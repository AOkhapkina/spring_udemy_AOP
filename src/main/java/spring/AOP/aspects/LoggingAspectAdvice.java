package spring.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectAdvice {
//
//    @Before("execution (public void spring.AOP.UniLibrary.getBook())")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: Trying to get a book");
//    }
//    @Before("execution (public void spring.AOP.UniLibrary.getBook())")
//    public void beforeReturnBook() {
//        System.out.println("beforeGetBookAdvice: Trying to get a book");
//    }
//
//    @Before("execution (public void getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Trying to get a book");
//    }
//
//    @Before("execution (public void returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Trying to get a book");
//    }
}
