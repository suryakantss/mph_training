package com.tagdemoapp.tags;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class HelloBodyTag extends SimpleTagSupport{
@Override
public void doTag() throws JspException, IOException {
	StringWriter sw = new StringWriter();
	getJspBody().invoke(sw);
	getJspContext().getOut().write(sw.toString().toUpperCase());
}
}
