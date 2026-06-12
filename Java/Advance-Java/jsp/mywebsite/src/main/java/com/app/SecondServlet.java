package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet implements Servlet{
	ServletConfig myconfig;

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return myconfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Servlet has been initialized";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		myconfig = config;
		
	}

	// handles both do get and do post 
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("Servlet method is executed the value received : "+request.getParameter("second_input"));
		out.close();
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Servlet is deallocated from the server");
	}

	
}
