package com.sopra.employee.service;

import com.sopra.employee.modal.Employee;
import com.sopra.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeServiceImpl{
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository =employeeRepository;
    }
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
