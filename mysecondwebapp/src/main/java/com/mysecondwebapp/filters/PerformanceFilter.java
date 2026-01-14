package com.mysecondwebapp.filters;

import java.io.IOException;
import java.time.LocalDateTime;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class PerformanceFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		if(req instanceof HttpServletRequest http)
		{
			if(http.getRequestURI().equals("/mysecondwebapp/ServletB"))
					throw new RuntimeException("Access denied...");
			System.out.println(req.getRemoteHost() + "," + http.getRequestURI() + "," + LocalDateTime.now());
		}
		Long start = System.currentTimeMillis();
		
		chain.doFilter(req, res);
		Long end = System.currentTimeMillis();
		System.out.println("It took " + (end-start) + "ms");
		
	}
}
