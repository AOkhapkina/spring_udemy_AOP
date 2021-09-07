package spring.AOP.aspects;
/*
Pointcut–выражение, описывающее где должен быть применён Advice.Spring AOP использует AspectJ Pointcutexpression language.
правила написания выражений для создания Pointcut, пробелы обязательны!:
        execution( modifiers-pattern? return-type-pattern declaring-type-pattern?
        method-name-pattern(parameters-pattern)throws-pattern? )
        * - любое/ .. - любой параметр любого типа в любом количестве вплоть до полного отсутствия/ (aop.Book,..) - первый параметр обязательные, остальные могут быть любыми или отсутствовать
optional?: modifiers-pattern? / declaring-type-pattern? -полное имя пути класса метода, например com.spring.Aspect; / throws-pattern? - тип исключения, выбрасываемого методом, например java.lang.Exception;
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectAdvicePointcut {

//    @Before("execution (public void get*())")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: Trying to get a book/magazine");
//    }
//    @Before("execution (* return*())")//модификатор не важен, return type - любой, метод начинается с returnДальшеЛюбоеПродолжение () - без параметра
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeGetBookAdvice: Trying to get a book/magazine");
//    }
//    @Before("execution (* *(..))") //такое логгирование будет отрабатывать перед всеми методами
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: Trying to get a book/magazine");
//    }
}
