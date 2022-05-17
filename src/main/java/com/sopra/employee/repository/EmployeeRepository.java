package com.sopra.employee.repository;

import com.sopra.employee.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
    public void deleteEmployeeById(Long id);
}
