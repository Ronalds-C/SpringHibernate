package com.infy.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	public EmployeeDao employeeDao;
	
	public String addEmployee(Employee employee){
		return employeeDao.addEmployee(employee);
	}
}
