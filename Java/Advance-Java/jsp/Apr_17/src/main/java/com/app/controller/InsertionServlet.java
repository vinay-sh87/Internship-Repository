package com.app.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;

import org.hibernate.engine.jdbc.proxy.BlobProxy;

import com.app.dao.EmployeeDao;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/InsertionServlet")
@MultipartConfig(maxFileSize = 10000000L)
public class InsertionServlet extends HttpServlet {

	EmployeeDao employeeDao;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		employeeDao = new EmployeeDao();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String name = req.getParameter("text_name");
			Part _image_in_part = req.getPart("file_upload");
			InputStream _image_in_bits = _image_in_part.getInputStream();
			Blob _image_in_blob = BlobProxy.generateProxy(_image_in_bits, _image_in_bits.available());
			String status = employeeDao.insertVisualData(name, _image_in_blob);
			PrintWriter out = resp.getWriter();
			out.println("The record insertion status : " + status);
			_image_in_bits.close();
			out.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}