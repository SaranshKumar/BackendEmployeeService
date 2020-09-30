package com.employee.h2.api.controller;


//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.h2.api.entity.EmployeeEntity;
import com.employee.h2.api.model.Employee;
import com.employee.h2.api.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Api(value = "EmployeeController, REST APIs that deal with Employee class")
public class EmployeeController {
	
	@Autowired
	private EmployeeService emp;
	@PostMapping("/addEmployee")
	@ApiOperation(value = "Add new employee to employee service", tags="addEmployee")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Added the employee successfully"),
							 @ApiResponse(code = 404, message = "Error adding employee details") })
	public String addEmployee(@RequestBody EmployeeEntity employee) {
		emp.addEmployeeService(employee);
		return "Employee Saved with name "+employee.getFullName();
	}
	@GetMapping("/showEmployees")
	@ApiOperation(value = "Fetch all the employees of employee service", tags="showEmployees")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Fetched the employees successfully"),
							 @ApiResponse(code = 404, message = "No employees found") })
	public Iterable<Employee> showEmployees(){
		return emp.showEmployeeService();
	}
	@GetMapping("/findEmployee/{empId}")
	@ApiOperation(value = "Fetch an employee by their Id", tags="findEmployees")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Employee found successfully"),
							 @ApiResponse(code = 404, message = "Employee not found") })
	public Iterable<Employee> findById(@PathVariable int empId){
		return emp.findByEmployeeId(empId);
	}
	
}
