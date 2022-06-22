package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service // this allows the autowired annotation in student controller to find the class
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Nathan",
                        "nath@mail.com",
                        LocalDate.of(2000, 02, 05),
                        25

                )
        );
    }
}
