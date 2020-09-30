package com.employee.h2.api.service;

import java.util.HashMap;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.h2.api.entity.EmployeeEntity;
import com.employee.h2.api.model.Employee;
import com.employee.h2.api.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public void addEmployeeService(EmployeeEntity employee) {

		Employee emp=new Employee();
		
		emp.setEmpId(employee.getEmpId());
		
		String[] name=employee.getFullName().split(" ");
		if(name.length==1)
		{
			emp.setFirstName(name[0]);
		}
		else if(name.length==2)
		{
			emp.setFirstName(name[0]);
			emp.setLastName(name[1]);
		}
		else if(name.length==3)
		{
			emp.setFirstName(name[0]);
			emp.setMiddleName(name[1]);
			emp.setLastName(name[2]);
		}
		
		emp.setDob(employee.getDob());
		emp.setCity(employee.getCity());
		emp.setContactNumber(employee.getContactNumber());
		
		repository.save(emp);
		
	}
	
	public Iterable<Employee> showEmployeeService(){
		
		return repository.findAll();
	}
	
	public Iterable<Employee> findByEmployeeId(Integer id) {

		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>(); 
		Iterable<Employee> allEmp=repository.findAll();
		allEmp.forEach(emp->empMap.put(emp.getEmpId(), emp));

	    Map<Integer, Employee> result = empMap.entrySet() 
	          .stream() 
	          .filter(map -> map.getKey().intValue() == id) 
	          .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));  
	  
	    return result.values();
		
		
	}
}
