
package client.employee;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-31T16:56:47.531+08:00
 * Generated source version: 3.1.6
 * 
 */
public final class EmployeeSoapService_EmployeeServiceSoapImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://internal.cxfservice.lessonslab.com/", "EmployeeServiceSoapImplService");

    private EmployeeSoapService_EmployeeServiceSoapImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EmployeeServiceSoapImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        EmployeeServiceSoapImplService ss = new EmployeeServiceSoapImplService(wsdlURL, SERVICE_NAME);
        EmployeeSoapService port = ss.getEmployeeServiceSoapImplPort();  
        
        {
        System.out.println("Invoking getEmployeeDetail...");
        java.lang.String _getEmployeeDetail_employeeId = "1";
        client.employee.Employee _getEmployeeDetail__return = port.getEmployeeDetail(_getEmployeeDetail_employeeId);
        System.out.println("getEmployeeDetail.result=" + _getEmployeeDetail__return);

        System.out.println("getEmployeeDetail.result=" + _getEmployeeDetail__return.getEmployeeId());
        }

        System.exit(0);
    }

}
