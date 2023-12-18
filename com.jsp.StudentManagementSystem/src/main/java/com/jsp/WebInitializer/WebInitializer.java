package com.jsp.WebInitializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.jsp.Configuration.config;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {config.class};
	}

	
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
