package org.sindu.springboot.MyCoolSpringBootApp.service;

import java.util.List;

import org.sindu.springboot.MyCoolSpringBootApp.dao.EmployeeJPADao;
import org.sindu.springboot.MyCoolSpringBootApp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmployeeJpaServiceImpl implements EmployeeJpaService {

	@Autowired
	EmployeeJPADao employeeJPADao;

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeJPADao.getAllEmployees();
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int employeeId) {
		return employeeJPADao.getEmployeeById(employeeId);
	}

	@Override
	@Transactional
	public Employee save(Employee employee) {
		employeeJPADao.save(employee);
		return employee;
	}

	@Override
	@Transactional
	public String delete(int employeeId) {
		employeeJPADao.delete(employeeId);
		return "Employee Id "+employeeId + " deleted successfully";
	}

}
