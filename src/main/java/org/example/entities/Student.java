package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer phoneNumber;
    private String email;
    private String address;
    private boolean status;
    private LocalDate dateOfBirth;
    private LocalDate enrollment;

    @ElementCollection
    private Set<Integer> courseIds;
}

