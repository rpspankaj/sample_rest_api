package com.test.demo.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

@Component
public class MyFilter  extends GenericFilterBean {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		String myauth =  httpServletRequest.getHeader("myauthsecret");
		if(null!= myauth && "pankaj".contains(myauth)) {
        	chain.doFilter(request, response);
        }else {
        	httpServletResponse.sendError(HttpServletResponse.SC_FORBIDDEN);
        }
		
	}

}
