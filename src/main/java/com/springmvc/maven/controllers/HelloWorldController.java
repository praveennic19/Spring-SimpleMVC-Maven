package com.springmvc.maven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hellopage")
	public ModelAndView helloWorld() {
		String msg = "Welcome in the world of Spring MVC";
		return new ModelAndView("hellopage", "msg", msg);
	}
}
