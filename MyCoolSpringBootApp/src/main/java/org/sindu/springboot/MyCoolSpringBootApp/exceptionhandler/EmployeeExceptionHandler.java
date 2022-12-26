package org.sindu.springboot.MyCoolSpringBootApp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<String> exceptionHandler(RuntimeException exc) {
		String error = "<b style='color:red'>403 - Forbidden/Bad Request:<br><br></b>" + exc.getCause();
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

	}

}
