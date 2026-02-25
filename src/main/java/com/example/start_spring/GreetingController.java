package com.example.start_spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello World again from Springboot 14:58";
	}

	@GetMapping("/hello")
	public String greetingViaHtml(Model model) {
		model.addAttribute("message", "Hello at time: " + java.time.LocalDateTime.now());
		return "hello";
	}

	@GetMapping("/fragment")
	public String greetingWithFragment(Model model) {
		model.addAttribute("message", "Hello at time: " + java.time.LocalDateTime.now());
		return "helloWithFragment";
	}
}
