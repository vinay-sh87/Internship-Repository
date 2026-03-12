package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	// 1. this is executed only once in the life-cycle of servlet when first request
	// falls on the servlet
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		// JOptionPane.showMessageDialog(null, "The first request comes & servlet init
		// method executed");
	}

	// 1. when the servlet is called from the browser using url pattern
	// 2. when you post some value form a form using the get method
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("do get responded, value you entered: " + req.getParameter("text_value"));
		out.close();
	}

	// 3. when you post value from a form using the post method
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("do post responded, the value you posted: "+req.getParameter("text_value"));
		int n = Integer.parseInt(req.getParameter("text_value"));
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		out.println("Factorial result : "+fact);
		
		out.close();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "resource destroyed");
		System.out.println("destroy");
	}
}