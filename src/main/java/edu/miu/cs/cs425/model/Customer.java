package edu.miu.cs.cs425.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private long id;
    private String name;
    private java.time.LocalDate dateOfBirth;
}
