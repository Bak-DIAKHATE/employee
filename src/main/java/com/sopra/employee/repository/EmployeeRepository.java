package com.sopra.employee.repository;

import com.sopra.employee.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
    Optional<Employee> findEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}
