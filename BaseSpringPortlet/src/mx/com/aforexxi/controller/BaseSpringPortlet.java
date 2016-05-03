package mx.com.aforexxi.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("VIEW")
public class BaseSpringPortlet {
	
	private final static Logger logger = Logger.getLogger(BaseSpringPortlet.class);

	@RequestMapping(params = "action=add")
	public String index() {
		logger.debug("Agregar parametro");
		return "welcome";
	}

	@RequestMapping
	public String inicio() {
		logger.debug("inicio");
		return "welcome";
	}
}
