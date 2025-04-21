package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet {
	
	ServletConfig con;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory method call"); 
         
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method call"); 
		con=config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method call"); 
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("Welcome to Servlet");
		out.println("Welcome to Servlet");
		out.println("Today"+ new Date(0).toString());
		

		
		out.print(getServletConfig());
		out.print(getServletInfo());



	}
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
