package com.ccf.employeemgmt.repository;

import com.ccf.employeemgmt.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
