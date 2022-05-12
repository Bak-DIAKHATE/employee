package com.sopra.employee.controller;

import com.sopra.employee.modal.Employee;
import com.sopra.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/employee")

public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public List<Employee> findAll() {
        return employeeService.findAllEmployees();
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeService.addEmployee(employee);
        return newEmployee;
    }

}
