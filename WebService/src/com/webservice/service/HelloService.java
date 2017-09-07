package com.webservice.service;

import javax.jws.WebService;

@WebService
public class HelloService {

	public HelloService(){
	}
	
	public String Hello(String s){
		return "Hello " + s;
	}
	
}
