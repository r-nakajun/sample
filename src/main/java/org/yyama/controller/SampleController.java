package org.yyama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

	@GetMapping(value = "/")
	public String sample() {

		// spring.xmlを読み込み
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/spring-mvc.xml");

		//context.close();

		return "sample";
	}
}
