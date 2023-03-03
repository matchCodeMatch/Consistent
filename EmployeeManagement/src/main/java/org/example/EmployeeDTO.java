package org.example;


import lombok.*;

import java.time.LocalDate;

@Data
public class EmployeeDTO {
    public enum Gender {
        MALE, FEMALE
    }

    private String id;
    private String firstName;
    private String lastName;
    private org.example.EmployeeDTO.Gender gender;
    private String email;
    private LocalDate dob;
    private LocalDate hireDate;
    private Double salary;
    private Integer phNumber;
    private String designation;
}