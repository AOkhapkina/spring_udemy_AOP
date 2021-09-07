package spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("We take the book from the UniLibrary");
    }

    public void returnBook(){
        System.out.println("We return the book to the UniLibrary");
    }

    @Override
    public void getMagazine() {
        System.out.println("We take the magazine from the UniLibrary");
    }

    @Override
    public void returnMagazine() {
        System.out.println("We return the magazine to the UniLibrary");
    }

    @Override
    public void addBook(){
        System.out.println("We add the book to the UniLibrary");
    }

    @Override
    public void addMagazine() {
        System.out.println("We add the magazine to the UniLibrary");

    }
}