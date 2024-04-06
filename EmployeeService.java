package com.EmployeeManagement.demo.service;


import com.EmployeeManagement.demo.model.Employee;
import java.util.List;
public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	
	void save(Employee employee);
	
	Employee getById(Long Id);
	
	void deleteById(Long ids);
	
}
