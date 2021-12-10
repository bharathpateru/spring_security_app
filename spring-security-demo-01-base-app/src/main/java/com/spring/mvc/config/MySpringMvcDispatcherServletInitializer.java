package com.spring.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override // this means dispatcher servlet
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{MyConfiguration.class};
	}

	@Override // means mapping the url to /
	protected String[] getServletMappings() {
		return new String[]{ "/" };
	}

}
