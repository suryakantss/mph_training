package com.productmanagerapp.tags;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class CapitalizeTag extends SimpleTagSupport{
	
	@Override
	public void doTag() throws JspException, IOException {
		StringWriter sw = new StringWriter();
		getJspBody().invoke(sw);
		getJspContext().getOut().println(sw.toString().toUpperCase());
	}

}
