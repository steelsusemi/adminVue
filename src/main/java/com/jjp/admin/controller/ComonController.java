package com.jjp.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComonController {
	@GetMapping("/")
	public String index() {
		System.out.println("1111111111111111111111111111");
		return "login";
	}
}
