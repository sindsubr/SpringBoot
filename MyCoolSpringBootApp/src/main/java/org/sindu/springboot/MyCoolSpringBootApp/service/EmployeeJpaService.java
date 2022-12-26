package org.sindu.springboot.MyCoolSpringBootApp.service;

import java.util.List;

import org.sindu.springboot.MyCoolSpringBootApp.entity.Employee;

public interface EmployeeJpaService {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int employeeId);

	public Employee save(Employee employee);

	public String delete(int employeeId);
}
