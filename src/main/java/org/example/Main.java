package org.example;

import org.example.DAO.PersonDAO;
import org.example.DAO.StudentDAO;
import org.example.entities.Person;
import org.example.entities.Student;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


//        PersonDAO personDAO = new PersonDAO();
//
//        personDAO.cretePerson(Person.builder()
//                .name("person1")
//                .age(20)
//                .build()
//        );


        Set<Integer> courseIds = Set.of(101, 102, 103);
        StudentDAO StudentDAO = new StudentDAO();

        StudentDAO.creteStudent(Student.builder()
                .name("Jens")
                .courseIds(courseIds)
                .phoneNumber(2929)
                .email("hej@hej")
                .address("hejvej")
                .status(true)
                .dateOfBirth(LocalDate.now())
                .enrollment(LocalDate.now())
                .build()

        );
    }
}