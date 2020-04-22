package com.employee.management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The ResourceNotFoundException Class.
 * 
 * @author Mohammed Riyaz
 * 
 * @since 22-March-2020
 * 
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new resource not found exception.
	 *
	 * @param message the message
	 */
	public ResourceNotFoundException(String message) {
		super(message);
	}
}