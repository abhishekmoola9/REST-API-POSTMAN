package com.acs.restapi.employeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acs.restapi.model.Employee;
import com.acs.restapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

	 @Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmplyees() {
		
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	

	@Override
	public Employee getDetailsByIdEmployee(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isPresent()) {
			return employee.get();
			
			
		}
		throw new  RuntimeException("ID is not find"+id);
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	
	

	
}
