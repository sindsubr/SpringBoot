package org.sindu.springboot.MyCoolSpringBootApp.dao;

import java.util.List;

import org.sindu.springboot.MyCoolSpringBootApp.entity.Employee;

public interface EmployeeJPADao {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int employeeId);

	public void save(Employee employee);

	public void delete(int employeeId);

}
