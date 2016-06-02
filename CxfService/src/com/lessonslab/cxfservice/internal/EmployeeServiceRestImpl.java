package com.lessonslab.cxfservice.internal;



import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.lessonslab.cxfservice.dao.EmployeeDao;
import com.lessonslab.cxfservice.model.Employee;
import com.lessonslab.cxfservice.restinterface.EmployeeRestService;
import com.lessonslab.cxfservice.soapinterface.EmployeeSoapService;

@WebService
public class EmployeeServiceRestImpl implements EmployeeRestService
{
	@Autowired
	private EmployeeDao employeeDao; 

	@Override
	public Employee getEmployeeDetail(String employeeId) 
	{
		if(employeeId == null)
		{
			return null;
		}		
		return employeeDao.getEmployeeDetails(employeeId);
	}
}
