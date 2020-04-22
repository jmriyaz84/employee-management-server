package com.employee.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.management.model.Employee;

/**
 * The EmployeeRepository Class.
 * 
 * @author Mohammed Riyaz
 * 
 * @since 22-March-2020
 * 
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	/**
	 * Find the employees by name.
	 *
	 * @param name employee first or last name
	 * 
	 * @return the filtered employee list
	 */
	@Query("from Employee where firstName like %?1% or lastName like %?1% order by firstName")
	List<Employee> findEmployeesByName(String name);

}
