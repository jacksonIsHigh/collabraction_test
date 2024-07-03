package com.test1.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartController {
	
	@RequestMapping(path = "/", method=RequestMethod.POST)
	public String index() {
		return index();
	}
}
