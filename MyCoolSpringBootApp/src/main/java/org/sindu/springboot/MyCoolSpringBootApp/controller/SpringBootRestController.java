package org.sindu.springboot.MyCoolSpringBootApp.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.sindu.springboot.MyCoolSpringBootApp.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class SpringBootRestController {
	@Value("${coach.name}")
	String coachName;
	@Value("${coach.list}")
	List<String> coachList;
	@Value("#{${coach.map}}")
	Map<String, String> coachMap;

	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String init() {
		return "<h1 style='color:green'><u>Welcome to Spring Boot Application</u></h1>" 
				+"<b>Current Time:</b>" 
				+ "<p style='color:red'>"
				+ LocalDateTime.now() + "</p><h1><u>Endpoints:<u></h1>"
				+ "<a href='/rest/coach'>Coach Name</a><br>"
				+ "<a href='/rest/coachList'>CoachList</a><br>"
				+ "<a href='/rest/coachMap'>CoachMap</a><br>"
				+ "<a href='/employees-spring-data-jpa/employees'>crud rest endpoints : spring-data-jpa</a><br>"
				+ "<a href='/employees'>crud rest endpoints: spring-data-jpa and spring-data-rest</a><br>"
				+ "<a href='/thymeleaf/'>Thymeleaf project</a><br>"
				+ "<a href='/thymeleaf/'>springboot</a><br>"
				+"<a href='/logout'>logout</a><br>";
	}

	@GetMapping("/coach")
	public String coach() {
		return coachName;
	}

	@GetMapping("/coachList")
	public List<String> coachList() {
		return coachList;
	}

	@GetMapping("/coachMap")
	public Map<String, String> coachMap() {
		return coachMap;
	}
	
	@GetMapping("/error")
	public ResponseEntity<String> error() {
		return new ResponseEntity<String>("<center><h1 style='color:red'>Sorry!! You are not autherized to view the content :(</h1>"
				+ "<img src='/images/404.png'/></center>", HttpStatus.FORBIDDEN);
	}
	
}
