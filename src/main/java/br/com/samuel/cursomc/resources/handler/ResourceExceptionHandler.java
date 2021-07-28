package br.com.samuel.cursomc.resources.handler;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.samuel.cursomc.services.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNofFound(ObjectNotFoundException e,HttpServletRequest request){
		StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(),e.getMessage(), LocalDate.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);	
	}
	
}
