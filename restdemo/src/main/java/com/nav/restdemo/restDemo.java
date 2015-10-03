package com.nav.restdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/hello")

public class restDemo {

	@GET
	@Path("/{param}")
	public String getMsg(@PathParam("param") String urlVal) {
		 
		System.out.println("Hiiii");
 
		return "Hello  " + urlVal;
 
	} 
	
	  // This method is called if HTML and XML is not requested  
	  @GET  
	  @Produces("text/xml")  
	  public String sayPlainTextHello() {  
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  
	  }  
	  
	  // This method is called if HTML is requested  
	  @GET  
	  @Produces("text/html")  
	  public String sayHtmlHello() {  
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
	        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
	  }
	// This method is called if XML is requested  
		  @GET  
		  @Path("/plain")
		  @Produces("text/plain")  
		  public String sayXMLHello() {  
		    return "<?xml version=\"1.0\"?>" + "<hello> Plain Jersey" + "</hello>";  
		  }  
		  

}
