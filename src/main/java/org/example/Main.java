package org.example;

import org.example.DAO.PersonDAO;
import org.example.entities.Person;

public class Main {
    public static void main(String[] args) {


        PersonDAO personDAO = new PersonDAO();

                personDAO.cretePerson(Person.builder()
                        .name("person1")
                        .age(20)
                        .build()
                );


    }
}