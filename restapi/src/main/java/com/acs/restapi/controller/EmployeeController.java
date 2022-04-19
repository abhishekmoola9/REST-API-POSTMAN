package com.acs.restapi.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.acs.restapi.employeeService.EmployeeService;
import com.acs.restapi.model.Employee;

@RestController
public class EmployeeController {
	
	/*
	 * @Autowired private EmployeeService employeeServices;
	 * 
	 * public List<Employee> getEmployees(){ return employeeServices.getEmplyees();
	 * }
	 */
	
	
	  @Autowired private EmployeeService eService;
	  
	  
	  @GetMapping("/getEmployees") public List<Employee> getEmoloyess(){ return
	  eService.getEmplyees(); }
	  
	  @PostMapping("/saveEmployee")
	  public Employee saveEmployee(@RequestBody Employee employee ) {
		  return eService.saveEmployee(employee);
		  
	  }
	  
	  @GetMapping("/getDetailsById/{id}")
	  public Employee getDetailsByIdEmployee(@PathVariable Long id){
		  return eService.getDetailsByIdEmployee(id);
		  
	  }
	  
	  @DeleteMapping("/deleteEmployee")
	  public void deleteEmployee(@RequestParam Long id) {
		   eService.deleteEmployee(id);
	  }
	  
	  @PutMapping("/updateEmployee/{id}")
	  public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employee) {
		  employee.setId(id);
		  return eService.updateEmployee(employee);
	  }
}
