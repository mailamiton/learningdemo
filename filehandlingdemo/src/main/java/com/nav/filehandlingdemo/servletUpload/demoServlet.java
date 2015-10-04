package com.nav.filehandlingdemo.servletUpload;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class demoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,
            HttpServletResponse response)
    throws ServletException, IOException
    {
		System.out.println("this is Test !!");
		 // Set response content type
	      response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      out.print("Hii from Servelet");
    }
	
}
