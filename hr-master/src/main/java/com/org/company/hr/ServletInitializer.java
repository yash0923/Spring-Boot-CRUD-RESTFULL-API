package com.org.company.hr;
/**
 * Created in Eclipse IDE.
 * Project : hr-master
 * User: yash
 * Date: 18/01/2020
 */

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HrApplication.class);
	}

}
