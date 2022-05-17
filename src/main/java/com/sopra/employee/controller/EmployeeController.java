package com.sopra.employee.controller;

import com.sopra.employee.modal.Employee;
import com.sopra.employee.repository.EmployeeRepository;
import com.sopra.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Employee>>findAll() {
        List<Employee> employees = employeeServiceImp.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeServiceImp.addEmployee(employee);
        return new ResponseEntity<>(newEmployee,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity <Employee> UpdateEmployee(@RequestBody  Employee employee){
        Employee updateEmployee = employeeServiceImp.updateEmployee(employee);
        return  new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity <?> deleteEmployee(@PathVariable("id") Long id) {
        employeeServiceImp.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

