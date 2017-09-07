package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/FtoC")
public class FarenheitToCelsius {
	
	@GET
	@Produces("application/json")
	public Response convertFToC() throws JSONException{
		JSONObject jsonObj = new JSONObject();
		double farenheit = 98.7;
		double celsius = (farenheit - 32) * 5 / 9;
		jsonObj.put("F", farenheit);
		jsonObj.put("C", celsius);
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObj;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("{f}")
	@Produces("application/json")
	public Response convertFToCfromInput(@PathParam("f") double farenheit) throws JSONException {
		JSONObject jsonObj = new JSONObject();
		double celsius = (farenheit - 32) * 5 / 9;
		jsonObj.put("F", farenheit);
		jsonObj.put("C", celsius);
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObj;
		return Response.status(200).entity(result).build();
	}
	
}
