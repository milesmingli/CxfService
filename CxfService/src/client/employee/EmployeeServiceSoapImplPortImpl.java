
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package client.employee;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-31T16:56:47.549+08:00
 * Generated source version: 3.1.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "EmployeeServiceSoapImplService",
                      portName = "EmployeeServiceSoapImplPort",
                      targetNamespace = "http://internal.cxfservice.lessonslab.com/",
                      wsdlLocation = "http://localhost:8080/CxfService/soap/employeeservices?wsdl",
                      endpointInterface = "client.employee.EmployeeSoapService")
                      
public class EmployeeServiceSoapImplPortImpl implements EmployeeSoapService {

    private static final Logger LOG = Logger.getLogger(EmployeeServiceSoapImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see client.employee.EmployeeSoapService#getEmployeeDetail(java.lang.String  employeeId )*
     */
    public client.employee.Employee getEmployeeDetail(java.lang.String employeeId) { 
        LOG.info("Executing operation getEmployeeDetail");
        System.out.println(employeeId);
        try {
            client.employee.Employee _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
