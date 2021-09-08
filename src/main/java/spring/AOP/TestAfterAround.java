package spring.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestAfterAround {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        }catch (Exception e){

        }


        context.close();

    }
}
