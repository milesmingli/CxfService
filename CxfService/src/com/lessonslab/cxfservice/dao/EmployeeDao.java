package com.lessonslab.cxfservice.dao;

import com.lessonslab.cxfservice.model.Employee;

public class EmployeeDao 
{
	
	public Employee getEmployeeDetails(String employeeId)
	{
		Employee emp = new Employee();
		emp.setDateOfJoining("01-02-2001");
		emp.setDepartment("Sales");
		emp.setEmail("test@example.com");
		emp.setEmployeeId(employeeId);
		emp.setFirstName("John");
		emp.setLastName("Smith");
		return emp;
	}
}
