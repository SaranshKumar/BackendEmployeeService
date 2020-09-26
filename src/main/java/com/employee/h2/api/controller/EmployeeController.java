package com.employee.h2.api.controller;


//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.h2.api.entity.EmployeeEntity;
import com.employee.h2.api.model.Employee;
import com.employee.h2.api.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService emp;
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody EmployeeEntity employee) {
		emp.addEmployeeService(employee);
		return "Employee Saved with name "+employee.getFullName();
	}
	@GetMapping("/showEmployees")
	public Iterable<Employee> showEmployees(){
		return emp.showEmployeeService();
	}
	
}
