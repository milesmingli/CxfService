package com.lessonslab.cxfservice.soapinterface;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IHelloWorld {
	String sayHi(@WebParam(name="username") String text);
}