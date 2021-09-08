package spring.AOP.aspects;
/*
Pointcut Declaration - чтобы не пользоваться copy-paste когда для нескольких Advice подходит один и тот же Pointcut.
•Возможность использования созданного Pointcut для множества Advice-ов
•Возможность быстрого изменения Pointcut expression для множества Advice-ов
•Возможность комбинирования Pointcut-ов
@Pointcut(“pointcut_expression”) private void pointcut_reference() {}
@Before(“pointcut_reference() ”) public void advice_name() { some code }
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectPointcutDeclaration {

    @Pointcut("execution(* get*())") //  Pointcut declaration
    private void allGetMethods() {
    }
//
//    @Before("allGetMethods()")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Trying to get a book/magazine");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetMagazineAdvice() {
//        System.out.println("beforeGetBookAdvice: Trying to get a book/magazine");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: Checking the rights to get a book/magazine");
//    }

}
