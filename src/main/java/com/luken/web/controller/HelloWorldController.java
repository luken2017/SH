package com.luken.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping(path = {"", "/", "/index"}, method = { RequestMethod.GET })
	public ModelAndView hello() {
		System.out.println("Hello .... ");
		return new ModelAndView("hello");
	}
}
