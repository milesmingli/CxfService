package com.lessonslab.cxfservice.soapinterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


import com.lessonslab.cxfservice.model.Employee;

/**
 * 
 * @author lessonslab.com
 * This is interface for the employee services
 *
 */

@WebService
public interface EmployeeSoapService 
{
	
	@WebMethod
	Employee getEmployeeDetail(@WebParam(name="employeeId") String employeeId);
		
	
	
		
}
