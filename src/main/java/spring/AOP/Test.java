package spring.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();
        schoolLibrary.returnBook();
        schoolLibrary.addMagazine();
        schoolLibrary.addBook();
        UniLibrary uniLibrary = context.getBean("uniLibrary",  UniLibrary.class);
//        uniLibrary.getBook();
//        uniLibrary.returnBook();
//        uniLibrary.addBook();
//        uniLibrary.addMagazine();



        context.close();
    }
}
