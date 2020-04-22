package com.employee.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Employee Entity Class.
 * 
 * @author Mohammed Riyaz
 * 
 * @since 22-March-2020
 * 
 */
@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Employee {	

	/** The id. */
	@Id
	@GeneratedValue
	private Long id;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The date of birth. */ 
	private String dateOfBirth;

	/** The age. */
	private Integer age;

	/** The salary. */
	private Integer salary;

	/** The date of join. */ 
	private String dateOfJoin;

	/** The year of experience. */
	private Integer yearOfExperience;

	/** The Reporting manager name. */
	private String reportingManager;

	/** The address. */
	private String address;

	/** The city. */
	private String city;

	/** The country. */
	private String country;
  
}
