package org.sindu.springboot.MyCoolSpringBootApp.dao;

import java.util.List;

import org.sindu.springboot.MyCoolSpringBootApp.entity.Employee;
/**
 * 
 * SpringBoot Data JPA and SpringBoot Data JPA Rest
 * 
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findAllByOrderByFirstNameDesc(); 
}
