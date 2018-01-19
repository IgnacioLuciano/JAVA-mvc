package com.example.demo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer {
	
	public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
		
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
		
	@Override
	protected Class <?>[] getServletConfigClasses() {
		return new Class <?>[] {WebConfig.class };
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class };
	}
	}
}
