package com.lessonslab.cxfservice.internal;

import javax.jws.WebService;

import com.lessonslab.cxfservice.soapinterface.IHelloWorld;

@WebService
public class HelloWorldImpl implements IHelloWorld {
	public String sayHi(String name){
		
		return "hello  " + name;
	}
	
}