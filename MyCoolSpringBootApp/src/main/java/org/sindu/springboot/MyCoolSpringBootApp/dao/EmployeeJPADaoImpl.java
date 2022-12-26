package org.sindu.springboot.MyCoolSpringBootApp.dao;

import java.util.List;

import org.sindu.springboot.MyCoolSpringBootApp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeJPADaoImpl implements EmployeeJPADao {

	@Autowired
	EntityManager entityManager;

	/**
	 * For hibernate crud operations : Get session from entity manager
	 * Session currentSession = entityManager.unwrap(Session.class);
	 * 
	 */

	@Override
	public List<Employee> getAllEmployees() {
		TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
		List<Employee> employeeList = query.getResultList();
		return employeeList;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee == null) {
			throw new RuntimeException("Employee Not Found in the id" + employeeId);
		}
		return employee;
	}

	@Override
	public void save(Employee employee) {
		Employee emp = entityManager.find(Employee.class, employee.getId());
		if (emp == null) {
			entityManager.persist(employee);
		} else {
			entityManager.merge(employee);
		}
	}

	@Override
	public void delete(int employeeId) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee == null) {
			throw new RuntimeException("Employee Not Found in the id" + employeeId);
		}
		entityManager.remove(employee);
	}

}
