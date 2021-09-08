package spring.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestBefore {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.addBook("Ivan", book);
        uniLibrary.addMagazine();

        University university = context.getBean("university", University.class);
        university.addStudents();
        List<Student> students = university.getStudents();
        System.out.println(students);


//        uniLibrary.getBook("Emma");
//        uniLibrary.getBook(book);
//        uniLibrary.returnBook();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();
//        schoolLibrary.returnBook();
//        schoolLibrary.addMagazine();
//        schoolLibrary.addBook();


        context.close();
    }
}
