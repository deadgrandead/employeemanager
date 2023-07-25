package ru.deadgrandead.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.deadgrandead.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
