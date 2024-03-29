package com.sopra.employee.modal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class EmployeeDetails extends Agency {

    private String type;
    private String nameDirector;
    private int salary;
}