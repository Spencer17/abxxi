package mx.com.aforexxi.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class BaseSpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { BaseSpringRootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { BaseSpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}


}
