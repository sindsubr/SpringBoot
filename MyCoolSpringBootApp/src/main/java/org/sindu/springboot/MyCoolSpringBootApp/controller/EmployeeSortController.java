package org.sindu.springboot.MyCoolSpringBootApp.controller;

import java.util.List;

import org.sindu.springboot.MyCoolSpringBootApp.dao.EmployeeRepository;
import org.sindu.springboot.MyCoolSpringBootApp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeSortController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public List<Employee> findAllByOrderByFirstName(){
		return employeeRepository.findAllByOrderByFirstNameDesc();
	}
}
