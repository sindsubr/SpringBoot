package org.sindu.springboot.MyCoolSpringBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class CrudThymeleafController {
	@GetMapping("/")
	public String init() {
		return "employees/employee-list";		
	}
}
