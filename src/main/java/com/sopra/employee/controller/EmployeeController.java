package com.sopra.employee.controller;

import com.sopra.employee.modal.Employee;
import com.sopra.employee.repository.EmployeeRepository;
import com.sopra.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/employee")

public class EmployeeController {

    @Autowired
    private final EmployeeServiceImpl employeeServiceImp;

    @Autowired
    private EmployeeRepository employeeRepository;
    public EmployeeController(EmployeeServiceImpl employeeServiceImp) {
        this.employeeServiceImp = employeeServiceImp;
    }

    @GetMapping("/all")
    public List<Employee> findAll() {
        return employeeServiceImp.findAllEmployees();
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeServiceImp.addEmployee(employee);
        return newEmployee;
    }
    @PutMapping("/update")
    public Employee UpdateEmployee(@RequestBody  Employee employee){
        Employee updateEmployee = employeeServiceImp.updateEmployee(employee);
        return updateEmployee;
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeServiceImp.deleteEmployee(id);
    }
}

