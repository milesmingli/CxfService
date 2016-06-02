package com.lessonslab.cxfservice.restinterface;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.model.wadl.ElementClass;

import com.lessonslab.cxfservice.model.Employee;

/**
 * 
 * @author lessonslab.com
 * This is interface for the employee services
 *
 */
@Path("/")
@WebService
public interface EmployeeRestService 
{
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("/getemployeedetail")
	@ElementClass(response=Employee.class)
	public Employee getEmployeeDetail(@QueryParam("employeeId") String employeeId);
	
	
	
	
		
}
