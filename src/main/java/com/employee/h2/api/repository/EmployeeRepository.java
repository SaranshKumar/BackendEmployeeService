package com.employee.h2.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.employee.h2.api.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
