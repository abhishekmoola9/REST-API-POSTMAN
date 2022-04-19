package com.acs.restapi.employeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestParam;

import com.acs.restapi.model.Employee;


public interface EmployeeService {
List<Employee> getEmplyees();

public Employee saveEmployee(Employee employee);
public Employee getDetailsByIdEmployee(Long id);
void deleteEmployee(Long id);
Employee updateEmployee(Employee employee);

}
