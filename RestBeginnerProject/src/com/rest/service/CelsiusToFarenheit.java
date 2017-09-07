package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/CtoF")
public class CelsiusToFarenheit {
	
	@GET
	@Produces("application/xml")
	public String convertCToF() {
		double celsius = 36.8;
		double farenheit = ((celsius * 9) / 5) + 32;
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + farenheit;
		return "<CtoF>" + "<celsius>" + celsius + "</celsius>" + "<CtoFoutput>" + result + "</CtoFoutput>" + "</CtoF>";
	}
	
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") double celsius) {
		double farenheit = ((celsius * 9) / 5) + 32;
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + farenheit;
		return "<CtoF>" + "<celsius>" + celsius + "</celsius>" + "<CtoFoutput>" + result + "</CtoFoutput>" + "</CtoF>";
	}
}
