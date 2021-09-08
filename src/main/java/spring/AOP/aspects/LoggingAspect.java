package spring.AOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.AOP.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    // Прописав joinpoint в параметре метода Advice,
    // мы получаем доступ к информации о сигнатуре и параметрах метода с бизнес-логикой.
    @Before("spring.AOP.aspects.MyPointcuts.allAddMethods()")
    public void beforeAllAddLoggingAdvice(JoinPoint joinpoint) {
        MethodSignature methodSignature = (MethodSignature) joinpoint.getSignature(); //reflection

        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getName: " + methodSignature.getName());
        System.out.println("methodSignature.getReturnType: " + methodSignature.getReturnType());
        System.out.println("methodSignature.getMethod: " + methodSignature.getMethod());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinpoint.getArgs();
            for (Object obj: arguments){//перебор каждого объекта типа Object в массиве объектов
                if (obj instanceof Book) {//instanceof проверяет, принадлежит ли объект к определённому классу.
                    Book myBook = (Book) obj;
                    System.out.println("The book information: name - " + myBook.getName() + ", author - " + myBook.getAuthor() + ", published year - " + myBook.getPublishedYear());
                }
                else if (obj instanceof String){
                    System.out.println("The book added by: " + obj);
                }
            }
        }

        System.out.println("beforeAllAddLoggingAdvice: Logging an attempt to use library");
        System.out.println("_________________________________________________");
    }


//@Before("spring.AOP.aspects.MyPointcuts.allMethods())")
//    public void beforeAllActionsLoggingAspect(){
//    System.out.println("beforeAllActionsLoggingAspect: Logging an attempt to use library");
//}
}
