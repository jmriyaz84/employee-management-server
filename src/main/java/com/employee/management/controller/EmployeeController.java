package com.employee.management.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.exception.ResourceNotFoundException;
import com.employee.management.model.Employee;
import com.employee.management.repository.EmployeeRepository;

/**
 * The EmployeeController Class.
 * 
 * @author Mohammed Riyaz
 * 
 * @since 22-March-2020
 * 
 */
@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {
	
	/** The Employee repository. */
	@Autowired
	private EmployeeRepository employeeRepository;

	 
	/**
	 * Get the employees.
	 *
	 * @return the employees
	 */
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

 
 
	/**
	 * Get the employee by id.
	 *
	 * @param employeeId the employee id
	 * 
	 * @return the employee response entity object
	 * 
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long employeeId) throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		return ResponseEntity.ok().body(employee);
	}

 
	 
	/**
	 * Get the employees by name.
	 *
	 * @param employeeName the employee name
	 * 
	 * @return the employees by name
	 */
	@GetMapping("/employees/{name}")
	public List<Employee> getEmployeesByName(@PathVariable("name") String employeeName) {
		return employeeRepository.findEmployeesByName(employeeName);
	}

	 
	/**
	 * Add the employee.
	 *
	 * @param employee the employee
	 * 
	 * @return the employee object
	 */
	@PostMapping("/addEmployee")
	public Employee addEmployee(@Valid @RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

 
 
	/**
	 * Update the employee.
	 *
	 * @param employeeId the employee id
	 * 
	 * @param employeeToUpdate the employee to update
	 * 
	 * @return the response entity object of employee
	 * 
	 * @throws ResourceNotFoundException when no employee exists on given id
	 */
	@PutMapping("/employee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long employeeId,
			@Valid @RequestBody Employee employeeToUpdate) throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId)); 
		employeeToUpdate.setId(employee.getId());
		Employee updatedEmployee = employeeRepository.save(employeeToUpdate);
		return ResponseEntity.ok(updatedEmployee);
	}

	 
	/**
	 * Delete employee.
	 *
	 * @param employeeId the employee id
	 * 
	 * @return the response entity with no content
	 * 
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/employee/{id}")
	public ResponseEntity deleteEmployee(@PathVariable("id") Long employeeId) throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		employeeRepository.delete(employee);
		return ResponseEntity.noContent().build();
	}	

}
