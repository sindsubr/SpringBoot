package org.sindu.springboot.MyCoolSpringBootApp.controller;

import java.util.List;

import org.sindu.springboot.MyCoolSpringBootApp.entity.Employee;
import org.sindu.springboot.MyCoolSpringBootApp.service.EmployeeJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees-spring-data-jpa")
public class EmployeeCrudRestSpringDataJpaController {

	@Autowired
	EmployeeJpaService employeeJPAService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeJPAService.getAllEmployees();
		return employees;
	}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
		return employeeJPAService.getEmployeeById(employeeId);
	}

	@PostMapping("/employees")
	public Employee save(@RequestBody Employee employee) {
		return employeeJPAService.save(employee);
	}
	
//	@PostMapping("/employees")
//	public ResponseEntity<Employee> save(@RequestBody Employee employee) {
//		HttpHeaders responseHeaders = new HttpHeaders();
//		responseHeaders.set("allow", "GET,POST");
//		return ResponseEntity.ok().headers(responseHeaders).body(employeeJPAService.save(employee));
//	}

	@PutMapping("/employees")
	public Employee update(@RequestBody Employee employee) {
		return employeeJPAService.save(employee);
	}

	@DeleteMapping("/employees/{employeeId}")
	public String delete(@PathVariable("employeeId") int employeeId) {
		return employeeJPAService.delete(employeeId);
	}

}
