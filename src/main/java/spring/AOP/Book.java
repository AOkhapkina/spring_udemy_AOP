package spring.AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Emma")
    private String name;
    @Value("Jane Austen")
    private String author;
    @Value("1815")
    private int publishedYear;

    public String getName(){
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    @Override
    public String toString() {
        return "name " + name;
    }
}
