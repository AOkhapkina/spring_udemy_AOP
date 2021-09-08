package spring.AOP.aspects;
/* @AfterThrowingAdvice не влияет на протекание программы при выбрасывании исключения.
С помощью @AfterThrowingAdvice можно получить доступ к исключению, которое выбросилось из метода с основной логикой.
 */

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import spring.AOP.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAfterAdvice {

    @Before("execution(* spring.AOP.University.getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: logging of getting a list of students BEFORE using getStudents method");
    }

    @AfterReturning(pointcut = "execution (* spring.AOP.University.getStudents())", returning = "students")
    // значение returning = "students" должен совпадать со значением в параметрах Advice
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student st1 = students.get(0);
        String nameSurname = st1.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        st1.setNameSurname(nameSurname);
        double avgGrade = st1.getAvgGrade();
        st1.setAvgGrade(avgGrade + 1);
        System.out.println("afterReturningGetStudentsLoggingAdvice: logging of getting a list of students AFTER using getStudents method");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println(("afterThrowingGetStudentsLoggingAdvice: logging of exception throwing " + exception));
    }

}
