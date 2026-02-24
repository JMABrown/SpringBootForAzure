package com.example.start_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello World again from Springboot 12:16";
	}

	@GetMapping("/hello")
	public String greetingViaHtml() {
		return "hello";
	}
}
