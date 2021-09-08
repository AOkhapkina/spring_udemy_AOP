package spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public Book getBook(Book book) {
        System.out.println("We take the book " + book + " from the UniLibrary");
        return book;
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add the book to the UniLibrary");
        System.out.println("_________________________________________________");
    }

//    public String getBook(String bookName) { //обычный способ получения названия, выше представлен с бином
//        System.out.println("We take the book " + bookName + " from the UniLibrary");
//        return bookName;
//    }

    @Override
    public void getBook() {
        System.out.println("We take the book from the UniLibrary");
        System.out.println("_________________________________________________");
    }

    public void returnBook() {
        System.out.println("We return the book to the UniLibrary");
        System.out.println("_________________________________________________");
    }

    @Override
    public void getMagazine() {
        System.out.println("We take the magazine from the UniLibrary");
        System.out.println("_________________________________________________");
    }

    @Override
    public void returnMagazine() {
        System.out.println("We return the magazine to the UniLibrary");
        System.out.println("_________________________________________________");
    }

    @Override
    public void addBook() {
        System.out.println("We add the book to the UniLibrary");
        System.out.println("_________________________________________________");
    }

    @Override
    public void addMagazine() {
        System.out.println("We add the magazine to the UniLibrary");
        System.out.println("_________________________________________________");
    }

}