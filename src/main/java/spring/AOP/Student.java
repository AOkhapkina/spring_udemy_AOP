package spring.AOP;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private String nameSurname;
    private int course;
    private double avgGrade;


}
