
package client.employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.employee package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Employee_QNAME = new QName("http://soapinterface.cxfservice.lessonslab.com/", "employee");
    private final static QName _GetEmployeeDetail_QNAME = new QName("http://soapinterface.cxfservice.lessonslab.com/", "getEmployeeDetail");
    private final static QName _GetEmployeeDetailResponse_QNAME = new QName("http://soapinterface.cxfservice.lessonslab.com/", "getEmployeeDetailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link GetEmployeeDetail }
     * 
     */
    public GetEmployeeDetail createGetEmployeeDetail() {
        return new GetEmployeeDetail();
    }

    /**
     * Create an instance of {@link GetEmployeeDetailResponse }
     * 
     */
    public GetEmployeeDetailResponse createGetEmployeeDetailResponse() {
        return new GetEmployeeDetailResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapinterface.cxfservice.lessonslab.com/", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapinterface.cxfservice.lessonslab.com/", name = "getEmployeeDetail")
    public JAXBElement<GetEmployeeDetail> createGetEmployeeDetail(GetEmployeeDetail value) {
        return new JAXBElement<GetEmployeeDetail>(_GetEmployeeDetail_QNAME, GetEmployeeDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapinterface.cxfservice.lessonslab.com/", name = "getEmployeeDetailResponse")
    public JAXBElement<GetEmployeeDetailResponse> createGetEmployeeDetailResponse(GetEmployeeDetailResponse value) {
        return new JAXBElement<GetEmployeeDetailResponse>(_GetEmployeeDetailResponse_QNAME, GetEmployeeDetailResponse.class, null, value);
    }

}
