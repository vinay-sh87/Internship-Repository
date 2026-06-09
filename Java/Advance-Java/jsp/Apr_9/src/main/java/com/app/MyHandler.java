package com.app;

import javax.swing.JOptionPane;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyHandler extends TagSupport{
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try {
			JspWriter out = pageContext.getOut();
			out.println("Hello...from tag");
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Reason of error"+e.getMessage());
		}
		return SKIP_BODY;
	}

}
