package com.example.employeeService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
	
private Long id;
private String firstName;
private String lastName;
private String email;
private String departmentCode;
public EmployeeDto() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeDto(Long id, String firstName, String lastName, String email, String departmentCode) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.departmentCode = departmentCode;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDepartmentCode() {
	return departmentCode;
}
public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}

}
