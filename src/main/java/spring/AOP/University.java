package spring.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Ivan Ivanov", 3, 8.5);
        Student st2 = new Student("Petr Petrov", 4, 7.5);
        Student st3 = new Student("Alan Smith", 5, 9.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public  List<Student> getStudents(){
        System.out.println("Beginning of getStudents method");
//        System.out.println(students.get(3));
        System.out.println("Info from getStudents method: " + students);
        System.out.println(students);
        return students;

    }


}
