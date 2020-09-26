package com.employee.h2.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
	@Id
	private int empId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dob;
	private String city;
	private String contactNumber;
	
//	public Employee(int empId, String firstName, String middleName, String lastName, Date dob, String city,
//			String contactNumber) {
//		super();
//		this.empId = empId;
//		this.firstName = firstName;
//		this.middleName = middleName;
//		this.lastName = lastName;
//		this.dob = dob;
//		this.city = city;
//		this.contactNumber = contactNumber;
//	}
	
	
	
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
//				+ lastName + ", dob=" + dob + ", city=" + city + ", contactNumber=" + contactNumber + "]";
//	}



	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	

}
